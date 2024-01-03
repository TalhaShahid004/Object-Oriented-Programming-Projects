import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseCode;
    private String title;
    private String instructor;
    private List<Student> students;
    private List<Grade> grades;

    public Course(int courseCode, String title, String instructor) {
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.title = title;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public double calculateAverageGrade(){
        double total = 0;
        for (Grade grade : grades){
            total += grade.getGradeValue();
        }
        return total / grades.size();
    }
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public int getCourseCode() {
        return courseCode;
    }
}


