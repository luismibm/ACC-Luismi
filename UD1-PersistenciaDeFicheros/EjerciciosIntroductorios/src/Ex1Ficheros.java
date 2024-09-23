import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1Ficheros {

    private static void showPath(File path) throws FileNotFoundException {

        if (!path.exists()) {
            throw new FileNotFoundException("Invalid Path");
        }

        if (path.isFile()) {
            System.out.println("Unique File: " + path.getName());
        } else if (path.isDirectory()) {
            File[] files = path.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    System.out.println("[D] " + files[i].getName());
                }
            }
            for (int j = 0; j < files.length; j++) {
                if (files[j].isFile()) {
                    System.out.println("[A] " + files[j].getName());
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Path: ");
        try {
            String pathName = sc.nextLine();
            File path = new File(pathName);
            showPath(path);
        } catch (Exception e) {
            System.err.println("Exception");
        }
        sc.close();

    }

}