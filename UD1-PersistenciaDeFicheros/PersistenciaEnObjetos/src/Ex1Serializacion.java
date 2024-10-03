import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

        Subject test = new Subject("Test", 10);

        try {
            FileOutputStream fileOut = new FileOutputStream("subject.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(test);
            System.out.println("Serialize: OK");
        } catch (IOException e) {
            System.out.println("Serialize: ERROR");
        }

    }
}