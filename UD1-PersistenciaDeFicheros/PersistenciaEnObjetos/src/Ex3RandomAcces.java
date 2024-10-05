import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ex3RandomAcces {

    public static void main(String[] args) throws IOException {
        double num;
        boolean fileEnd = false;
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            do {
                System.out.println("- - - MENU - - -");
                System.out.println("1 - addAtTheBeginning");
                System.out.println("2 - addAtTheEnd");
                System.out.println("3 - showFileCreated");
                System.out.println("4 - replaceNumber");
                System.out.println("5 - Exit");
                System.out.print("Option:");
                Scanner sc = new Scanner(System.in);
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        num = sc.nextDouble();
                        file.seek(0);
                        file.writeDouble(num);
                        break;
                    case 2:
                        // Añadir double al final del fichero
                        break;
                    case 3:
                        file.seek(0);
                        while (file.getFilePointer() < file.length()) {
                            System.out.println(file.readDouble());
                        }
                        break;
                    case 4:
                        // Sustituir el número indicado por el usuario por otro numero también indicado pro el usuario
                        break;
                    case 5:
                        System.out.println("\nShutting Down...\n");
                        fileEnd = true;
                        break;
                    default:
                        System.out.println("\nSelect a valid option\n");
                        break;
                }

            } while (!fileEnd);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File Not Found");
        } catch (IOException e) {
            System.out.println("ERROR: IOException");
        }

    }

}