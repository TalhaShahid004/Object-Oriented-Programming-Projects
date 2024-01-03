public class Main {
    public static void main(String[] args) {
        // Create courses
        Course mathCourse = new Course(101, "Mathematics", "John Doe");
        Course physicsCourse = new Course(102, "Physics", "Jane Smith");

        // Create students
        Student student1 = new Student(1, "Alice", "alice@example.com");
        Student student2 = new Student(2, "Bob", "bob@example.com");
        Student student3 = new Student(3, "Charlie", "charlie@example.com");

        // Enroll students in courses
        student1.enroll(mathCourse);
        student2.enroll(mathCourse);
        student3.enroll(physicsCourse);

        // Add grades
        Grade grade1 = new Grade(student1.getStudentId(), mathCourse.getCourseCode(), 90.0);
        Grade grade2 = new Grade(student2.getStudentId(), mathCourse.getCourseCode(), 85.0);
        Grade grade3 = new Grade(student3.getStudentId(), physicsCourse.getCourseCode(), 95.0);
        mathCourse.addGrade(grade1);
        mathCourse.addGrade(grade2);
        physicsCourse.addGrade(grade3);

        // Calculate average grades
        double mathAverageGrade = mathCourse.calculateAverageGrade();
        double physicsAverageGrade = physicsCourse.calculateAverageGrade();

        // Print average grades
        System.out.println("Math Course Average Grade: " + mathAverageGrade);
        System.out.println("Physics Course Average Grade: " + physicsAverageGrade);

        // View grades for students
        student1.viewGrades();
        student2.viewGrades();
        student3.viewGrades();
    }
}
