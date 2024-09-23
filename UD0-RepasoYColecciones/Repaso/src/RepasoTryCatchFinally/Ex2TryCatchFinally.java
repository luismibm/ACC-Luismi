package RepasoTryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2TryCatchFinally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Numerador: ");
            double numerador = sc.nextInt();
            System.out.print("Denominador: ");
            double denominador = sc.nextInt();
            System.out.println("\nSu división daría: " + numerador/denominador);
        } catch (ArithmeticException e) {
            System.out.println("\nFallo: InputMismatch");
        } catch (InputMismatchException e) {
            System.out.println("\nFallo: Arithmetic");
        } finally {
            sc.close();
        }

    }
}