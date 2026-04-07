package seu.edu.bd.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seu.edu.bd.studentmanagement.model.Advising;
import seu.edu.bd.studentmanagement.model.Course;
import seu.edu.bd.studentmanagement.model.Student;
import seu.edu.bd.studentmanagement.service.AdvisingService;
import seu.edu.bd.studentmanagement.service.CourseService;
import seu.edu.bd.studentmanagement.service.StudentService;

@SpringBootTest
public class AdvisingServiceTest {

  @Autowired
    private AdvisingService advisingService;
  @Autowired
  private StudentService studentService;
  @Autowired
  private CourseService courseService;

  @Test
    public void advising1(){
      Student student = studentService.getByStudentId("2");
      System.out.println(student.getName());

      Course course = courseService.getByCode("CSE102");
      System.out.println(course.getTitle());

      Advising advising = new Advising();
      advising.setStudent(student);
      advising.setCourse(course);
      advising.setSemester("Spring");

      advisingService.save(advising);
  }

  @Test
  public void getAdvisingData(){
    for(Advising advising : advisingService.getAll()){
      System.out.println(
              advising.getStudent().getName()+ " " +
                      advising.getStudent().getCgpa()+ " " +
                      advising.getCourse().getCode()+ " "
      );
    }
  }

}
