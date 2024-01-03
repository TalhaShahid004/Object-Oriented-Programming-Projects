import java.util.ArrayList;
import java.util.List;

public class Instructor {

    private String name;
    private String contact;
    private List<Course> courses;

    public Instructor(String name, String contact){
        this.contact = contact;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }

    public void viewStudentsGrades(){

    }



}

