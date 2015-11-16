import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgFile {
    public static void main(String[] args){

        try (FileInputStream fis = new FileInputStream("jpg/java-logo.jpg");
        FileOutputStream fos = new FileOutputStream("jpg/my-copied-picture.jpg")){
        byte[] buffer = new byte[4096];

            while (true){
                int readBytes = fis.read(buffer, 0 ,buffer.length);
                if (readBytes <= 0) break;
                fos.write(buffer, 0 ,readBytes);
            }
        }

        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
