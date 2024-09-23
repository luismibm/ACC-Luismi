package ExamenExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1ExamenExceptions {

    public static void imprimePositivo(int num) throws Exception {
        if (num >= 0) {
            System.out.println(num);
        } else {
            throw new Exception();
        }
    }

    public static void imprimeNegativo(int num) throws Exception {
        if (num < 0) {
            System.out.println(num);
        } else {
            throw new Exception();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un número postivo: ");
            imprimePositivo(sc.nextInt());
            System.out.print("Introduce un número negativo: ");
            imprimeNegativo(sc.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatch");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            sc.close();
        }

    }

}