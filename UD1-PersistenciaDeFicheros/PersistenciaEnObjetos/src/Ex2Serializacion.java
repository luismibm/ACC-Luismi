import com.sun.jdi.Value;

import java.io.*;
import java.util.*;

public class Ex2Serializacion {

    public static class Subject implements java.io.Serializable {
        public String name;
        public double mark;

        public Subject(String name, double mark) {
            this.name = name;
            this.mark = mark;
        }
    }

    private static void printSubjectMarks(Map<String, Double> subjects) {
        double sum = 0;
        for (Map.Entry<String, Double> subject : subjects.entrySet()) {
            System.out.println(subject.getKey() + " -> " + subject.getValue());
            sum += subject.getValue();
        }
        System.out.println("Average Mark -> " + sum / subjects.size());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Double> subjects = new HashMap<>();
        List<String> subjectNames = Arrays.asList("PRG", "SRV", "MOV", "INT", "SGE");

        for (String subjectName : subjectNames) {
            double mark = -1;
            while (mark < 1 || mark > 10) {
                System.out.print(subjectName + ": ");
                try {
                    mark = sc.nextDouble();
                    if (mark < 1 || mark > 10) {
                        System.out.println("Error: Not a number between 1 ans 10");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Not a number");
                    sc.nextLine();
                }
            }
            subjects.put(subjectName, mark);
        }

        try {
            FileOutputStream fileOut = new FileOutputStream("subject.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(subjects);
            System.out.println("Serialize: OK");
        } catch (IOException e) {
            System.out.println("Serialize: ERROR - IOException");
        }

        Map<String, Double> deserializedSubjects = null;

        try {
            FileInputStream fileIn = new FileInputStream("subject.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            deserializedSubjects = (Map<String, Double>) objectIn.readObject();
            System.out.println("Deserialize: OK");
        } catch (IOException e) {
            System.out.println("Deserialize: ERROR - IOException");
        } catch (ClassNotFoundException e) {
            System.out.println("Deserialize: ERROR - ClassNotFoundException");
        }

        if (deserializedSubjects != null) {
            printSubjectMarks(deserializedSubjects);
        }

    }
}