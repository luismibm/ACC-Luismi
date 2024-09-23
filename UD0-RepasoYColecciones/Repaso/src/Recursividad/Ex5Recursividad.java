package Recursividad;

public class Ex5Recursividad {

    private static int calcularPotencia(int base, int potencia) {
        if (potencia == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, potencia - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(calcularPotencia(5, 2));
        System.out.println(calcularPotencia(5, 3));
        System.out.println(calcularPotencia(5, 4));
        System.out.println(calcularPotencia(5, 5));

    }

}