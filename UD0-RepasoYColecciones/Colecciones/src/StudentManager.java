import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static void StudentList(ArrayList<Student> s) {
        for (Student student : s) {
            System.out.println(student);
        }
    }

    public static void StudentSearch(ArrayList<Student> s) {}

    public static void StudentAdd(ArrayList<Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        s.add(new Student(id, name, age));
    }

    public static void StudentUpdate(ArrayList<Student> s) {}

    public static void StudentDelete(ArrayList<Student> s) {}

    public static void main(String[] args) {

        ArrayList<Student> StudentArrayList = new ArrayList<Student>();

        Student stu1 = new Student(1, "Jaume", 18);
        Student stu2 = new Student(2, "Samuel", 19);
        Student stu3 = new Student(3, "Daniel", 22);
        Student stu4 = new Student(4, "Ikeri", 21);
        Student stu5 = new Student(5, "Martina", 18);
        StudentArrayList.add(stu1);
        StudentArrayList.add(stu2);
        StudentArrayList.add(stu3);
        StudentArrayList.add(stu4);
        StudentArrayList.add(stu5);

        boolean exit = false;
        do {

            System.out.println("\n- - STUDENT MANAGER - -");
            System.out.println("1 - StudentList");
            System.out.println("2 - StudentSearch");
            System.out.println("3 - StudentAdd");
            System.out.println("4 - StudentUpdate");
            System.out.println("5 - StudentDelete");
            System.out.println("6 - Exit");
            System.out.println("Option: ");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    StudentList(StudentArrayList);
                    break;
                case 2:
                    StudentSearch(StudentArrayList); // Repair
                    break;
                case 3:
                    StudentAdd(StudentArrayList);
                    break;
                case 4:
                    StudentUpdate(StudentArrayList); // Make
                    break;
                case 5:
                    StudentDelete(StudentArrayList); // Make
                    break;
                case 6:
                    exit = true;
                    sc.close();
                    break;
            }

        } while (!exit);

    }

}