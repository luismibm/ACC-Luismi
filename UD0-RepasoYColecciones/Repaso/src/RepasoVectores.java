import java.util.Scanner;

public class RepasoVectores {

    public static void VecFill(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int randomNum = (int) (-110 + Math.random() * (100 - (-100) + 1));
            v[i] = randomNum;
        }
    }

    public static void VecDisplay(int[] v) {
        System.out.print("\nVector: \n[ " + v[0] + ", ");
        for (int i = 1; i < v.length-1; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.print(v[v.length-1] + " ]\n");
    }

    public static void VecAverage(int[] v) {
        double sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        double avg = sum / v.length;
        System.out.println("\nMedia: " + avg);
    }

    public static boolean ExistsInVec (int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void GreaterThanInVec(int[] v, int x) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= x) {
                cont++;
            }
        }
        System.out.println("There are " + cont + " numbers greater than " + x);
    }


    public static void main(String[] args) {

        System.out.print("Tamaño del vector: ");
        Scanner sc = new Scanner(System.in);
        int vecLength = sc.nextInt();

        int[] vec = new int[vecLength];

        boolean exit = false;
        do {
            System.out.println("\n- - OPTION MENU - -");
            System.out.println("1 - Vec Fill & Display");
            System.out.println("2 - Vec Average");
            System.out.println("3 - Vec Exists");
            System.out.println("4 - Vec Greater");
            System.out.println("5 - Exit");
            System.out.print("Option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    VecFill(vec);
                    VecDisplay(vec);
                    break;
                case 2:
                    VecAverage(vec);
                    break;
                case 3:
                    System.out.print("\nNumber to check: ");
                    int numToCheckExists = sc.nextInt();
                    if (ExistsInVec(vec, numToCheckExists)) {
                        System.out.println("Exists in Vec");
                    } else {
                        System.out.println("Not in Vec");
                    }
                    break;
                case 4:
                    System.out.print("\nNumber to check: ");
                    int numToCheckGreater = sc.nextInt();
                    GreaterThanInVec(vec, numToCheckGreater);
                    break;
                case 5:
                    exit = true;
            }

        } while (!exit);

    }

}