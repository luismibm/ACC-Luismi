import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3RandomAcces {

    public static void main(String[] args) throws IOException {
        double num;
        boolean exit = false;
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            do {
                System.out.println("- - - MENU - - -");
                System.out.println("1 - addAtTheBeginning");
                System.out.println("2 - addAtTheEnd");
                System.out.println("3 - showFileCreated");
                System.out.println("4 - replaceNumber");
                System.out.println("5 - Exit");
                System.out.print("Option: ");
                Scanner sc = new Scanner(System.in);
                try {
                    int option = sc.nextInt();
                    switch (option) {
                        case 1:
                            try {
                                System.out.print("- Number: ");
                                num = sc.nextDouble();
                                file.seek(0);
                                file.writeDouble(num);
                            } catch (InputMismatchException e) {
                                System.out.println("ERROR: InputMismatchException");
                            }
                            break;
                        case 2:
                            try {
                                System.out.print("- Number: ");
                                num = sc.nextDouble();
                                file.seek(file.length());
                                file.writeDouble(num);
                            } catch (InputMismatchException e) {
                                System.out.println("ERROR: InputMismatchException");
                            }
                            break;
                        case 3:
                            file.seek(0);
                            int cont = 0;
                            System.out.println();
                            while (file.getFilePointer() < file.length()) {
                                System.out.println("[" + cont + "]: " + file.readDouble());
                                cont++;
                            }
                            System.out.println();
                            break;
                        case 4:
                            try {
                                System.out.print("- Position: ");
                                long pos = sc.nextLong();
                                System.out.print("- Number: ");
                                num = sc.nextDouble();
                                file.seek(pos * 8);
                                file.writeDouble(num);
                            } catch (InputMismatchException e) {
                                System.out.println("ERROR: InputMismatchException");
                            }
                            break;
                        case 5:
                            System.out.println("\nShutting Down...\n");
                            exit = true;
                            sc.close();
                            break;
                        default:
                            System.out.println("\nSelect a valid option\n");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: InputMismatchException");
                }

            } while (!exit);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File Not Found");
        } catch (IOException e) {
            System.out.println("ERROR: IOException");
        }

    }

}