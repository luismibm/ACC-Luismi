package RepasoTryCatchFinally;

import java.util.Scanner;

public class Ex3TryCatchFinally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] vec = new double[5];
        for (int i = 0; i < vec.length; i++) {
            try {
                System.out.print("Valor de [" + i + "] -> ");
                vec[i] = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Error: Introduce un valor de tipo Double");
                sc.nextLine();
                i--;
            }
        }
        sc.close();

        for (int i = 0; i < vec.length; i++) {
            System.out.print("v[" + i + "]:" + vec[i] + "  ");
        }




    }
}