import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String name;
    private String contact;
    private List<Course> courses;

    public Student(int studentId, String name, String contact) {
        this.contact = contact;
        this.courses = new ArrayList<>();
        this.name = name;
        this.studentId = studentId;
    }

    public void enroll(Course course){
        courses.add(course);
        course.addStudent(this);
    }

    public void drop(Course course){
        courses.remove(course);
        course.removeStudent(this);
    }

    public void viewGrades(){

    }

    public int getStudentId() {
        return studentId;
    }
}

