import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3ExpresionesRegulares {
    public static void main(String[] args) {

        String text = "Ejemplo para contar palabras";
        String regex = "[A-Za-zÀ-ÿ]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int cont = 0;
        while (matcher.find()) {
            String phrase = matcher.group();
            cont++;
        }
        System.out.println("Palabras: " + cont);
    }
}