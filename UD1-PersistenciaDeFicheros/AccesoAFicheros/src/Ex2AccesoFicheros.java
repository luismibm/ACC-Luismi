import java.io.*;

public class Ex2AccesoFicheros {

    public static void main(String[] args) {

        File studentNotes = new File("Documentos/alumnos_notas.txt");

        try {

            FileReader studentsNotesReader = new FileReader(studentNotes);
            BufferedReader studentNotesBufferedReader = new BufferedReader(studentsNotesReader);

            String line;
            while (studentNotesBufferedReader.readLine() != null) {
                line = studentNotesBufferedReader.readLine();

                // Here split using the space

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}