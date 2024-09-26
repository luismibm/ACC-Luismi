import java.util.HashSet;
import java.util.Scanner;

public class StudentManagerHashSet {

    public static void StudentList(HashSet<Student> s) {
        for (Student student : s) {
            System.out.println(student);
        }
    }

    public static void StudentSearch(HashSet<Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        for (Student student : s) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
    }

    public static void StudentAdd(HashSet<Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        s.add(new Student(id, name, age));
    }

    public static void StudentUpdate(HashSet<Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("- Edit -\n1.Name \n2.Age\nOption:");
        switch (sc.nextInt()) {
            case 1:
                System.out.print("New Name: ");
                for (Student student : s) {
                    if (student. getId() == id) {
                        sc.nextLine();
                        student.setName(sc.nextLine());
                    }
                }
                break;
            case 2:
                System.out.print("New Age: ");
                for (Student student : s) {
                    if (student. getId() == id) {
                        student.setAge(sc.nextInt());
                    }
                }
                break;
        }
    }

    public static void StudentDelete(HashSet<Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        for (Student student : s) {
            if (student.getId() == id) {
                s.remove(student);
            }
        }
    }

    public static void main(String[] args) {

        HashSet<Student> StudentHashSet = new HashSet<Student>();

        Student stu1 = new Student(1, "Jaume", 18);
        Student stu2 = new Student(2, "Samuel", 19);
        Student stu3 = new Student(3, "Daniel", 22);
        Student stu4 = new Student(4, "Ikeri", 21);
        Student stu5 = new Student(5, "Martina", 18);
        StudentHashSet.add(stu1);
        StudentHashSet.add(stu2);
        StudentHashSet.add(stu3);
        StudentHashSet.add(stu4);
        StudentHashSet.add(stu5);

        boolean exit = false;
        do {

            System.out.println("\n- - STUDENT MANAGER - -");
            System.out.println("1 - StudentList");
            System.out.println("2 - StudentSearch");
            System.out.println("3 - StudentAdd");
            System.out.println("4 - StudentUpdate");
            System.out.println("5 - StudentDelete");
            System.out.println("6 - Exit");
            System.out.print("Option: ");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    StudentList(StudentHashSet);
                    break;
                case 2:
                    StudentSearch(StudentHashSet);
                    break;
                case 3:
                    StudentAdd(StudentHashSet);
                    break;
                case 4:
                    StudentUpdate(StudentHashSet);
                    break;
                case 5:
                    StudentDelete(StudentHashSet);
                    break;
                case 6:
                    exit = true;
                    sc.close();
                    break;
            }

        } while (!exit);

    }

}