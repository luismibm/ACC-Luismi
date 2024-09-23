package RepasoString;

import java.util.Scanner;

public class Ex2String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("First Phrase: ");
        String firstPhrase = sc.nextLine();
        System.out.print("Second Phrase: ");
        String secondPhrase = sc.nextLine();
        sc.close();

        System.out.print("\nTeniendo en cuenta la capialización de las letras: ");
        if (firstPhrase.equals(secondPhrase)) {
            System.out.println("They are equals");
        } else {
            System.out.println("They are not equals");
        }

        System.out.print("Sin tener en cuenta la capialización de las letras: ");
        if ((firstPhrase).equalsIgnoreCase(secondPhrase)) {
            System.out.println("They are equals");
        } else {
            System.out.println("They are not equals");
        }

    }
}