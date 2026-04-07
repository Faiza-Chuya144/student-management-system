package seu.edu.bd.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seu.edu.bd.studentmanagement.model.Course;
import seu.edu.bd.studentmanagement.service.CourseService;

@SpringBootTest
public class CourseServiceTest {
    @Autowired
    private CourseService courseService;

    @Test
    public void save(){
      Course course = new Course("CSE102","Java",3);

      courseService.save(course);
    }
}
