import java.util.Scanner;


public class LongestIncreasingSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] numbersAsString = sc.nextLine().split(" ");

        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {

            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        int startMaxSequence = 0;
        int lengthMaxSequence = 0;

        int startSequence = 0;
        int lengthSequence = 0;
        int endSeuqnce = 0;

        for (int i = 0; i <numbers.length - 1 ; i++) {
            if (numbers[i] < numbers[i + 1]){
                System.out.print(numbers[i] + " ");
            } else{
                System.out.print(numbers[i]);
                endSeuqnce = i;
                lengthSequence = endSeuqnce - startSequence + 1;

                if (lengthSequence > lengthMaxSequence){
                    lengthMaxSequence = lengthSequence;
                    startMaxSequence = startSequence;
                }
                startSequence = i + 1;
            }
        }

        int lastIndexOfTheSequence = numbers.length - 1;
        System.out.println(numbers[lastIndexOfTheSequence]);
        endSeuqnce = lastIndexOfTheSequence;
        lengthSequence = endSeuqnce - startMaxSequence + 1;
        
        if (lengthSequence > lengthMaxSequence){
            lengthMaxSequence = lengthSequence;
            startMaxSequence = startSequence;
        }

        System.out.print("Longest: ");
        for (int i = startMaxSequence; i < startMaxSequence + lengthMaxSequence ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}