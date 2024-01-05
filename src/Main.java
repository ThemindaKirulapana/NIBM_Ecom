import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList=new ArrayList<>();
        List<Course>  courseList=new ArrayList<>();
        Admin admin =new Admin(studentList,courseList);
        Scanner scanner=new Scanner(System.in);

        System.out.println("________________Welcome to NIBM EMS______________");

        while (true){

            System.out.println("1.Add Student Details");
            System.out.println("2.Display Student Details");
//          System.out.println("3.Update Student Details");
            System.out.println("4.Add Course Details");
            System.out.println("5.Display Course Details");
            System.out.println("6.Exit\n");
            System.out.println("Enter your choice");

            int Choice;//create variable choice

            Choice = scanner.nextInt();
            scanner.nextLine();

            switch (Choice)
            {
                case 1:
                    admin.addstudent();
                    break;
                case 2:
                    admin.Display_student();
                    break;
                case 4:
                    admin.addCourse();
                    break;
                case 5:
                    admin.displayCourse();
                    break;
                case 6:
                    System.out.println("Exiting..........");
                    System.exit(0);

                default:
                    System.out.println ("Invalid Choice Please Try Again...........!");
            }


        }
    }
}