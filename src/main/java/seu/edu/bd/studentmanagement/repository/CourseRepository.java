package seu.edu.bd.studentmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import seu.edu.bd.studentmanagement.model.Course;

import java.util.Optional;

@Repository
public interface CourseRepository extends MongoRepository<Course, String > {
  Optional<Course> findByCode(String code);
}
