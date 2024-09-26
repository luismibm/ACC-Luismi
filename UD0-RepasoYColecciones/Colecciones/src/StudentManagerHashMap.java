import java.util.HashMap;
import java.util.Scanner;

public class StudentManagerHashMap {

    public static void StudentList(HashMap<Integer, Student> s) {
        for (Student student : s.values()) {
            System.out.println(student);
        }
    }

    public static void StudentSearch(HashMap<Integer, Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        Student student = s.get(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found");
        }
    }

    public static void StudentAdd(HashMap<Integer, Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        s.put(id, new Student(id, name, age));
    }

    public static void StudentUpdate(HashMap<Integer, Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        Student student = s.get(id);
        if (student != null) {
            System.out.print("- Edit -\n1.Name \n2.Age\nOption:");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("New Name: ");
                    sc.nextLine();
                    student.setName(sc.nextLine());
                    break;
                case 2:
                    System.out.print("New Age: ");
                    student.setAge(sc.nextInt());
                    break;
            }
        } else {
            System.out.println("Student not found");
        }
    }

    public static void StudentDelete(HashMap<Integer, Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        if (s.remove(id) == null) {
            System.out.println("Student not found");
        }
    }

    public static void main(String[] args) {

        HashMap<Integer, Student> StudentHashMap = new HashMap<>();

        Student stu1 = new Student(1, "Jaume", 18);
        Student stu2 = new Student(2, "Samuel", 19);
        Student stu3 = new Student(3, "Daniel", 22);
        Student stu4 = new Student(4, "Ikeri", 21);
        Student stu5 = new Student(5, "Martina", 18);
        StudentHashMap.put(stu1.getId(), stu1);
        StudentHashMap.put(stu2.getId(), stu2);
        StudentHashMap.put(stu3.getId(), stu3);
        StudentHashMap.put(stu4.getId(), stu4);
        StudentHashMap.put(stu5.getId(), stu5);

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
                    StudentList(StudentHashMap);
                    break;
                case 2:
                    StudentSearch(StudentHashMap);
                    break;
                case 3:
                    StudentAdd(StudentHashMap);
                    break;
                case 4:
                    StudentUpdate(StudentHashMap);
                    break;
                case 5:
                    StudentDelete(StudentHashMap);
                    break;
                case 6:
                    exit = true;
                    sc.close();
                    break;
            }

        } while (!exit);

    }

}