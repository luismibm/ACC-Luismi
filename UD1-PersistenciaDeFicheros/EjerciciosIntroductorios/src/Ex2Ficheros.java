import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Ex2Ficheros {

    private static void showPath(File path, boolean info) throws FileNotFoundException {

        if (!path.exists()) {
            throw new FileNotFoundException("Invalid Path");
        }

        if (path.isFile()) {
            System.out.print("Unique File: " + path.getName());

        } else if (path.isDirectory()) {
            File[] files = path.listFiles();
            Arrays.sort(files);
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory())
                    System.out.println("[D] " + files[i].getName());
                if (info)
                    System.out.println("| Size: " + files[i].length() + " bytes\n| Last Modified: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(files[i].lastModified())));
            }
            for (int j = 0; j < files.length; j++) {
                if (files[j].isFile())
                    System.out.println("[A] " + files[j].getName());
                if (info)
                    System.out.println("| Size: " + files[j].length() + " bytes\n| Last Modified: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(files[j].lastModified())));
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Path: ");
        try {
            String pathName = sc.nextLine();
            File path = new File(pathName);
            showPath(path, true);
            System.out.println("- - - -");
            showPath(path, false);
        } catch (Exception e) {
            System.err.println("Exception");
        }
        sc.close();

    }

}