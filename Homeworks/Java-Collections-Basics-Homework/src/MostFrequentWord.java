import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        Map<String, Integer> wordsCount = new TreeMap<>();
        int maxCount = 0;
        for (String word : words) {
            Integer count = wordsCount.get(word);
            if (count == null) {
                count = 0;
            }

            if (count + 1 > maxCount){
                maxCount = count + 1;
            }
            wordsCount.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> word : wordsCount.entrySet()){

            if (word.getValue() == maxCount){
                System.out.printf("%s -> %d times", word.getKey(), word.getValue());
            }
        }
    }
}
