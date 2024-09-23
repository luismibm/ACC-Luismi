package RepasoTryCatchFinally;

import java.util.Scanner;

public class Ex4TryCatchFinally {
    public static void main(String[] args) {

        int[] vec = new int[(int)(1 + Math.random() * (100 - (1) + 1))];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int)(1 + Math.random() * (10 - (1) + 1));
        }

        Scanner sc = new Scanner(System.in);

        try {
            int input = 1;
            do {
                System.out.print("\nPosición del vector a mostrar: ");
                input = sc.nextInt();
                if (input >= 0) {
                    System.out.print("v[" + input+  "] -> " + vec[input]);
                }
            } while (input >= 0);
        } catch (Exception e) {
            System.out.println("Exception Error");
        } finally {
            sc.close();
        }

    }
}