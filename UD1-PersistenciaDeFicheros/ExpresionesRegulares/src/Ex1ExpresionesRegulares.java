import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1ExpresionesRegulares {
    public static void main(String[] args) {

        String text = "ejemplo@mail.com otroejemplo@mail.com luismi@gmail.com luismi@pwrgenesis.com";
        String regex = "@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String domain = matcher.group();
            System.out.println(domain);
        }

    }
}