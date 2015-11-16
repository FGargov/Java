import java.io.*;
import java.util.ArrayList;

public class SumLines {
    public static void main(String[] args){

        try (BufferedReader br = new BufferedReader(new FileReader(new File("TextFiles/lines.txt")))){

            String line;
            long sum = 0;
            while ((line = br.readLine()) != null) {
                for (int i=0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                System.out.println(sum);
                sum = 0;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e1) {
            System.err.println("Cannot read file!");
        }

    }
}
