package seu.edu.bd.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seu.edu.bd.studentmanagement.model.Student;
import seu.edu.bd.studentmanagement.service.StudentService;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void save(){
        Student student = new Student();
        student.setsId("2");
        student.setName("Mr.Babul");
        student.setProgram("EEE");
        student.setCgpa(3.60);

        studentService.save(student);
    }
}
