package Recursividad;

public class Ex2Recursividad {

    public static void mostarVector(int[] v, int index) {
        if (index < v.length) {
            mostarVector(v, index + 1);
            System.out.print(v[index] + "  ");
        }
    }

    public static void main(String[] args) {

        int[] vec = new int[10];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (i+1)*2;
        }

        mostarVector(vec, 0);

    }

}