package seu.edu.bd.studentmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import seu.edu.bd.studentmanagement.model.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
     Optional<Student> findBysId(String sId);
}
