package Recursividad;

public class Ex3Recursividad {

    public static void buscarEnVector(int[] v, int index, int element) {
        if (v[index] == element) {
            System.out.println("Posición v[" + index + "]");
        } else {
            buscarEnVector(v, index + 1, element);
        }
    }

    public static void main(String[] args) {

        int[] vec = {10,20,30,40,50,60,70,80,90,99};

        buscarEnVector(vec, 0, 80);

    }

}