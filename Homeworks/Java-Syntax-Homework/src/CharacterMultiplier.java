import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       String[] words = sc.nextLine().trim().split("\\s");

        String firstWord;
        String secondWord;

        if (words[0].length() > words[1].length()){
            firstWord = words[0];
            secondWord = words[1];
        }
        else {
            secondWord = words[0];
            firstWord = words[1];
        }

        Integer charSum = calculateSum(firstWord, secondWord);

        System.out.println(charSum);

    }

    public static Integer calculateSum(String firstWord, String secondWord){

        Integer charSum = 0;

        for (int i = 0; i < firstWord.length(); i++) {
            if (i < secondWord.length()){
                charSum += firstWord.charAt(i) * secondWord.charAt(i);
            }
            else {
                charSum += firstWord.charAt(i);
            }
        }

        return charSum;
    }
}


