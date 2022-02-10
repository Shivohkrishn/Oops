public class GradeBook {
    private String courseName;
    private String instructorName;
    public GradeBook(String courseName, String instructorName){
        this.courseName = courseName;
        this.instructorName = instructorName;
    }
    public GradeBook(GradeBook source){
        this.courseName = source.courseName;
        this.instructorName = source.instructorName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setInstructorName(String InstructorName) {
        this.instructorName = InstructorName;
    }
    public String getInstructorName() {
        return instructorName;
    }

    public String displayMessage(){
        String message =" Welcome EveryOne!! \n The course name is "+ getCourseName()+"." +
                "\n This Course is instructed by "+getInstructorName()+".";
        return message;
    }
}