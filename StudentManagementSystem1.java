import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem1 {
    ArrayList<Student1> students = new ArrayList<>();


    public  void  main() {
        System.out.println("Student Management System");
        while (true) {

        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Remove");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                Add();
                break;

            case 2:
                View();
                break;

            case 3:
                Remove();
                break;

            case 4: 
                Exit();
                break;
        
            default:
                break;
        }
    }
}

    public  void Add() {
        System.out.println("Enter student ID: ");
        Scanner scanner = new Scanner(System.in);
        int stud = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter student Name: ");
        String StdNum = scanner.nextLine();
        
        System.out.println("Enter student Age: ");
        int StdAge = scanner.nextInt();

        Student1 student= new Student1(stud, StdNum, StdAge);
 
        students.add(student);
        System.out.println("Students added successfully!");
    }

    public  void View() {
        if (students.isEmpty()) {
            System.out.println("Students List is Empty");
            return;
        } else {
            System.out.println("List Of All Students: ");
            for (Student1 student : students) {
            System.out.println(student.toString());
        }
        }
    }

    public void Remove() {
        System.out.println("Enter student ID to remove: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        boolean studentNotFound = false;
        for (Student1 student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Successfully removed");
                studentNotFound = true;
                break;
            }
        }
        if (studentNotFound == false) {
            System.out.println("Yout Id is Not found");
        }
    }

    public static void Exit() {
        System.out.println("Thank you for using the Student Management System");
        System.exit(0);

    }


    public static void main(String[] args) {
        StudentManagementSystem1 studentManagementSystem= new StudentManagementSystem1();
        studentManagementSystem.main();

}


}
