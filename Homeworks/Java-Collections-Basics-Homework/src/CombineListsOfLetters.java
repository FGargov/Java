import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        ArrayList<Character> combinedList = new ArrayList<>();

        for (Character ch : sc.nextLine().toCharArray()) { // input characters first line
            l1.add(ch);
        }

        for (Character ch : sc.nextLine().toCharArray()) { // input characters second line
            l2.add(ch);
        }

        combinedList.addAll(l1);

        for (int i = 0; i < l2.size(); i++) {
            if (l1.contains(l2.get(i))) {
                continue;
            } else {
                combinedList.add(' ');
                combinedList.add(l2.get(i));
            }
        }

        for (Character ch : combinedList) {
            System.out.print(ch);
        }
    }
}