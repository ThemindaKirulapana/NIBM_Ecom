import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Admin {

    private List<Student> studentList;

    private List<Course> courseList;
    private Scanner scanner;

    public Admin(List<Student> studentList, List<Course> courseList) {
        this.studentList = studentList;
        this.courseList = courseList;
        this.scanner =new Scanner(System.in);
    }

    public void addstudent(){

        System.out.println("Enter Student ID:");
        String StID = scanner.next();
        System.out.println("Enter Student Name :");
        String name = scanner.next();
        System.out.println("Enter Date of Birth:");
        String DOB = scanner.next();
        System.out.println("Enter Student Age:");
        int age = scanner.nextInt();
        System.out.println("Enter Student Grade:");
        int Grade = scanner.nextInt();

        System.out.println("Enter Guardian Name :");
        scanner.nextLine();
        String Gname = scanner.next();

        System.out.println("Enter Guardian Conatact Number :");
        Long ContactNumber = scanner.nextLong();

        Student student=new Student(Gname,ContactNumber,name,StID,DOB,age,Grade);
        studentList.add(student);

        System.out.println("Student added Successfully___________!\n");
    }

    public void Display_student(){

        for (Student currentStudent:studentList){

            System.out.println("Student ID :"+currentStudent.getStudent_ID());
            System.out.println("Student Name:"+currentStudent.getStudent_name());
            System.out.println("Student Age:"+currentStudent.getStudent_Age());
            System.out.println("Student Age"+currentStudent.getStudent_Age());

            //Parent parent=currentStudent.getParent();

            System.out.println("Parent Name :"+currentStudent.getParent_name());
            System.out.println("Parent ContactNumber"+currentStudent.getParent_contact());
        }
    }
    public void addCourse(){

        System.out.println("Enter Course ID:");
        String C_ID=scanner.next();

        System.out.println("Enter Course Name:");
        String C_name=scanner.next();

        System.out.println("Enter Course discription");
        String Dis=scanner.next();

        System.out.println("Enter Course Duration");
        int C_Duration=scanner.nextInt();

        Course course=new Course(C_ID,C_name,Dis,C_Duration);
        courseList.add(course);

        System.out.println("Course added Successfully___________!\n");

    }
    public void displayCourse(){

        for (Course currentCourse :courseList){

            System.out.println("Course ID:"+currentCourse.getCourse_ID());
            System.out.println("Course Name:"+currentCourse.getCourse_Name());
            System.out.println("Course Discription:"+currentCourse.getCourse_Discription());
            System.out.println("Course Duration:"+currentCourse.getCourse_Duration());
        }
    }
}
