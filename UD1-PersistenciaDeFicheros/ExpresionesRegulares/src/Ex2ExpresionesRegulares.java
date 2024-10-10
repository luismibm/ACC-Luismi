import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2ExpresionesRegulares {
    public static void main(String[] args) {

        String text = "1234-5678-9123-4567";
        String regex = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find())
            System.out.println("Card Number: Valid");
        else
            System.out.println("Card Number: Invalid");

    }
}