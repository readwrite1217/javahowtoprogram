package Chapter3.Gradebook;

public class GradeBook {

    private String courseName;
    private String instructorName; // name of the instructor

    public GradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for \n %s! taught by %s\n", getCourseName(), getInstructorName());
    }
}
