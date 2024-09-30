import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Ex7AccesoFicheros {

    private static void processFile(File file) throws IOException {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        Hashtable<String, Integer> wordFrequency = new Hashtable<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    // Línea 24: Convierte a minúsulas y elimina todos los carácteres fuera del primer argumento
                    if (!word.isEmpty()) {
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                        // Línea 27: Si aún no está contando la palabra, la añade al Map
                    }
                }
            }
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordFrequency.entrySet());
        sortedWords.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); // Lambda Exp

        // Línea 34: Convierte wordFrequency en una lista (ArrayList) para poder ordenar las palabras por su frequencia
        // Línea 35: Ordena sortedWords según la frequencia de las palabras. Utiliza un comparador que compara los valores de las entradas del mapa

        System.out.println("- - " + file.getName() + " - -");
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
        System.out.println("Top 10 most common words:");
        for (int i = 0; i < Math.min(10, sortedWords.size()); i++) {
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

    }

    public static void main(String[] args) {

        File booksDirectory = new File("Documentos/Libros");

        /*
        if (booksDirectory.isDirectory()) {
            File[] files = booksDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty or an I/O error occurred.");
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
        */

        File[] files = booksDirectory.listFiles();
        for (File file : files) {
            try {
                processFile(file);
            } catch (IOException e) {
                System.out.println("Error in:" + file.getName());
            } catch (Exception e) {
                System.out.println("Exception: Other");
            }
        }

    }

}