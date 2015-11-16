import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] numbersAsString = sc.nextLine().trim().split("\\s");
        String[] commands = sc.nextLine().trim().split("\\s");

        int[] nums = new int[numbersAsString.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numbersAsString[i]);
        }

        int numberOfElements = Integer.parseInt(commands[1]);

        String oddEven = commands[2];

        if(oddEven.toLowerCase().equals("odd")) {
            printMatches(nums, numberOfElements, 1);
        } else {
            printMatches(nums, numberOfElements, 0);
        }

    }

    private static void printMatches(int[] nums, int numOfelements, int type) {
        for (int i = 0; i < nums.length; i++) {
            if(numOfelements == 0) {
                break;
            }

            if(nums[i] % 2 == type) {
                numOfelements--;
                System.out.print(nums[i] + " ");
            }
        }
    }
}
