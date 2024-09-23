package RepasoTryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1TryCatchFinally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un número entero: ");
            int number = sc.nextInt();
            System.out.println("\nNúmero introducido: " + number);
        } catch (InputMismatchException e) {
            System.out.println("\nValor introducido incorrecto");
        } finally {
            sc.close();
        }

    }
}