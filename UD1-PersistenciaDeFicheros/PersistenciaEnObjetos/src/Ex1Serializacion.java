import javax.naming.Name;
import java.io.*;
import java.util.*;

public class Ex1Serializacion {

    public static class Subject implements java.io.Serializable {
        public String name;
        public double mark;

        public Subject(String name, double mark) {
            this.name = name;
            this.mark = mark;
        }
    }

    private static void printSubjectMarks(List<Subject> subjects) {
        double sum = 0;
        for (Subject subject : subjects) {
            System.out.println(subject.name + " -> " + subject.mark);
            sum += subject.mark;
        }
        System.out.println("Average Mark -> " + sum / subjects.size());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Subject> subjects = new ArrayList<>();
        List<String> subjectNames = Arrays.asList("PRG", "SRV", "MOV", "INT", "SGE");

        // Falta manejar excepciones y limtar le rango de 1 a 10
        for (String subjectName : subjectNames) {
            System.out.print(subjectName + ": ");
            double mark = sc.nextDouble();
            sc.nextLine();
            subjects.add(new Subject(subjectName, mark));
        }

        printSubjectMarks(subjects);

        // Pruebas Serialize + Deserialize

        Subject serializeTest = new Subject("Test", 10);

        try {
            FileOutputStream fileOut = new FileOutputStream("subject.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(serializeTest);
            System.out.println("Serialize: OK");
        } catch (IOException e) {
            System.out.println("Serialize: ERROR - IOException");
        }

        Subject deserializeTest = null;

        try {
            FileInputStream fileIn = new FileInputStream("subject.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializeTest = (Subject) in.readObject();
            System.out.println("Deserialize: OK");
        } catch (IOException e) {
            System.out.println("Deserialize: ERROR - IOException");
        } catch (ClassNotFoundException e) {
            System.out.println("Deserialize: ERROR - ClassNotFoundException");
        }

        if (deserializeTest != null) {
            System.out.println("Name: " + deserializeTest.name);
            System.out.println("Mark: " + deserializeTest.mark);
        }

    }
}