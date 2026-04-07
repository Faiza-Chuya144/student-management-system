package seu.edu.bd.studentmanagement.service;

import org.springframework.stereotype.Service;
import seu.edu.bd.studentmanagement.model.Course;
import seu.edu.bd.studentmanagement.repository.CourseRepository;

import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public Course save(Course course){
       return courseRepository.save(course);
    }

    public Course getByCode(String code){
        Optional<Course> optional = courseRepository.findByCode(code);
        return optional.orElse(null);
    }

}
