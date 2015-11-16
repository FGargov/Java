import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MagicCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] allCards = sc.nextLine().split("[ ????]+");

        Map<String, Integer> cardFaces = new LinkedHashMap<>();

        for (String cards : allCards){
            Integer count = cardFaces.get(cards);

            if (count == null){
                count = 0;
            }
            cardFaces.put(cards, count + 1);
        }

        for (Map.Entry<String, Integer> output : cardFaces.entrySet()){

            double frequency  = ((double) output.getValue() * 100) / allCards.length;

            System.out.printf("%s -> %.2f%%\n", output.getKey(), frequency );
        }
    }
}

