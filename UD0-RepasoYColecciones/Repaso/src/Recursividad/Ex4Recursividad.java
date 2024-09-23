package Recursividad;

public class Ex4Recursividad {

    private static int numOfDigits(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + numOfDigits(n/10);
        }
    }

    public static void main(String[] args) {

        System.out.println(numOfDigits(1));
        System.out.println(numOfDigits(5));
        System.out.println(numOfDigits(10));
        System.out.println(numOfDigits(27));
        System.out.println(numOfDigits(4557));

    }

}