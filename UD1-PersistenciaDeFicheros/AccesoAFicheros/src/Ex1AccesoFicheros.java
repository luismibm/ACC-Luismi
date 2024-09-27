import java.io.*;

public class Ex1AccesoFicheros {

    public static void main(String[] args) {

        int maxNum = 0;
        int minNum = 999999999;

        File nums = new File("Documentos/numeros.txt");
        try {

            FileReader numsReader = new FileReader(nums);
            BufferedReader numsBufferedReader = new BufferedReader(numsReader);

            String line;
            while ((numsBufferedReader.readLine()) != null) {
                line = numsBufferedReader.readLine();
                int num = Integer.parseInt(line);
                if (num > maxNum ) {
                    maxNum = num;
                }
                if (num < minNum) {
                    minNum = num;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("maxNum: " + maxNum);
        System.out.println("minNum: " + minNum);

    }

}