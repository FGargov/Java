import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        Map<String, Integer> uniqueElements = new HashMap<>();

        for (String str : input){
            if (uniqueElements.containsKey(str)){
                int value = uniqueElements.get(str) + 1;
                uniqueElements.put(str, value);
            }else{
                uniqueElements.put(str, 1);
            }
        }


        String mostFrequentElement = null;
        int frequency = 0;

        for (String key : uniqueElements.keySet()){
            int count = uniqueElements.get(key);
            if (count > frequency){
                frequency = count;
                mostFrequentElement = key;
            }
        }

        for (int i = 0; i < frequency; i++) {
            System.out.print(mostFrequentElement + " ");
        }


    }
}
