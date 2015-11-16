import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] text = sc.nextLine().toLowerCase().split("\\W+");

        Set<String> uniqueWords = new TreeSet<String>();


        for (String word : text){
            if (!uniqueWords.contains(word)){
                uniqueWords.add(word);
            }
        }

        for (String uniqueWordsStrings : uniqueWords){
            System.out.print(uniqueWordsStrings + " ");
        }
    }
}
