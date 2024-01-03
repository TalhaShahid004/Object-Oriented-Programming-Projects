public class Grade {
    private int studentID;
    private int courseCode;
    private double gradeValue;

    public Grade(int studentID, int courseCode, double gradeValue) {
        this.studentID = studentID;
        this.courseCode = courseCode;
        this.gradeValue = gradeValue;
    }

    public double getGradeValue(){
        return gradeValue;
    }

}
