package Recursividad;

public class Ex1Recursividad {

    private static int sumatorio(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumatorio(n - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(sumatorio(0));
        System.out.println(sumatorio(1));
        System.out.println(sumatorio(2)); // Debería imprimir 3 (2 + 1)
        System.out.println(sumatorio(3)); // Debería imprimir 6 (3 + 2 + 1)
        System.out.println(sumatorio(4)); // Debería imprimir 10 (4 + 3 + 2 + 1)

    }

}