package RepasoString;

import java.util.Scanner;

public class Ex1String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Phrase: ");
        String phrase = sc.nextLine();
        sc.close();

        String[] words = phrase.split(" ");
        for (String word : words) {
            System.out.println("- " + word);
        }

    }
}