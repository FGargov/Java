
import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Locale locale = Locale.ROOT;

        ArrayList al = new ArrayList();
        al.add(5.4);
        al.add(12.3);
        al.add(6.7);
        al.add(8.7);
        al.add(15.6);

        try (ObjectOutputStream oos = new ObjectOutputStream
                (new BufferedOutputStream
                        (new FileOutputStream("ArrayListFiles/doubles.list")))) {
            oos.writeObject(al);
        }

        try(ObjectInputStream ois = new ObjectInputStream
                (new BufferedInputStream
                        (new FileInputStream("arrayListFiles/doubles.list")))
        ){
            String fileRead = ois.readObject().toString();
            System.out.println(fileRead);
            ois.close();
        }


        }
    }

