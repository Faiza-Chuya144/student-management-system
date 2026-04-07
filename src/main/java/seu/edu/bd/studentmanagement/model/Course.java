package seu.edu.bd.studentmanagement.model;

import org.springframework.data.annotation.Id;

public class Course {
    @Id
    private String id;
    private String code;
    private String title;
    private double credit;


    public Course(String code, String title, double credit) {
        this.code = code;
        this.title = title;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
