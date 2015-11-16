import java.io.*;

public class AllCapitals {
    public static void main(String[] args){

       try(BufferedReader br = new BufferedReader(new FileReader("TextFiles/lines.txt"));
       BufferedWriter bw = new BufferedWriter(new FileWriter("TextFiles/linesOut.txt"))) {

           String s;
           while ((s = br.readLine()) != null){
            bw.write(s.toUpperCase());
            bw.newLine();

               try (PrintWriter pw = new PrintWriter((new FileWriter(new File("TextFiles/linesOut.txt"))))){
                pw.write(bw.toString());
               }
               catch (IOException ex){
                   ex.printStackTrace();
               }
           }
       }
       catch (IOException ex){
           ex.printStackTrace();
       }
    }
}

