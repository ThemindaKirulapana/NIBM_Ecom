public class Student extends Parent {

    private String  Student_name,Student_ID,Student_DOB;
    private int Student_Age,Student_Grade;

     public Parent parent;

    public Student(String parentName, Long parentContact, String student_name, String student_ID, String student_DOB, int student_Age, int student_Grade) {
        super(parentName, parentContact);
        Student_name = student_name;
        Student_ID = student_ID;
        Student_DOB = student_DOB;
        Student_Age = student_Age;
        Student_Grade = student_Grade;
       // this.parent = parent;
    }

    //setters and getters
    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(String student_ID) {
        Student_ID = student_ID;
    }

    public String getStudent_DOB() {
        return Student_DOB;
    }

    public void setStudent_DOB(String student_DOB) {
        Student_DOB = student_DOB;
    }

    public int getStudent_Age() {
        return Student_Age;
    }

    public void setStudent_Age(int student_Age) {
        Student_Age = student_Age;
    }

    public int getStudent_Grade() {
        return Student_Grade;
    }

    public void setStudent_Grade(int student_Grade) {
        Student_Grade = student_Grade;
    }

    public Parent getParent(){

        return parent;
    }
}
