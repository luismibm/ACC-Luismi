package RepasoString;

import java.util.Scanner;

public class Ex5String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();

        String reversedPhrase = "";
        for (int i = phrase.length() -1; i >= 0; i--) {
            reversedPhrase = reversedPhrase + phrase.charAt(i);
        }

        System.out.println("Original: " + phrase);
        System.out.println("Reversed: " + reversedPhrase);
        if (phrase.equalsIgnoreCase(reversedPhrase)) {
            System.out.println("Son palíndromos");
        } else {
            System.out.println("No son palindromos");
        }

    }
}