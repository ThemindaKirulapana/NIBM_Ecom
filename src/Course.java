public class Course {

    private String Course_ID,Course_Name,Course_Discription;
    private int Course_Duration;

    public Course(String course_ID, String course_Name, String course_Discription, int course_Duration) {
        Course_ID = course_ID;
        Course_Name = course_Name;
        Course_Discription = course_Discription;
        Course_Duration = course_Duration;
    }

    public String getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(String course_ID) {
        Course_ID = course_ID;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    public String getCourse_Discription() {
        return Course_Discription;
    }

    public void setCourse_Discription(String course_Discription) {
        Course_Discription = course_Discription;
    }

    public int getCourse_Duration() {
        return Course_Duration;
    }

    public void setCourse_Duration(int course_Duration) {
        Course_Duration = course_Duration;
    }
}
