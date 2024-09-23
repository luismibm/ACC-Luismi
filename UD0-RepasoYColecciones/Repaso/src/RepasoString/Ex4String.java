package RepasoString;

import java.util.Scanner;

public class Ex4String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Phrase: ");
        String phrase = sc.nextLine();
        sc.close();

        char[] letters = phrase.toLowerCase().toCharArray();
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a') {
                contA++;
            }
            if (letters[i] == 'e') {
                contE++;
            }
            if (letters[i] == 'i') {
                contI++;
            }
            if (letters[i] == 'o') {
                contO++;
            }
            if (letters[i] == 'u') {
                contU++;
            }
        }

        System.out.println("Numb of\nA: " + contA + ", E: " + contE + ", I: " + contI + ", O: " + contO + ", U: " + contU);

    }
}