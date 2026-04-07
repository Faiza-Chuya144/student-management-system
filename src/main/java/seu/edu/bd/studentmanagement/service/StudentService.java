package seu.edu.bd.studentmanagement.service;

import org.springframework.stereotype.Service;
import seu.edu.bd.studentmanagement.model.Student;
import seu.edu.bd.studentmanagement.repository.StudentRepository;

import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public Student getByStudentId(String sId) {

        Optional<Student> sOptional = studentRepository.findBysId(sId);
            return sOptional.orElse(null);


    }
}

