package RepasoString;

import java.util.Scanner;

public class Ex3String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("Apellido1: ");
        String lastName1 = sc.nextLine();
        System.out.print("Apellido2: ");
        String lastName2 = sc.nextLine();

        String username = (name.substring(0,3) + lastName1.substring(0,3) + lastName2.substring(0,3)).toUpperCase();
        System.out.println("\nUsername: " + username);

    }
}