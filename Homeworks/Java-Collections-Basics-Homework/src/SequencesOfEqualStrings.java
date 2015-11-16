import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().trim().split(" ");

        System.out.print(arr[0] + " ");


        for (int i = 1; i < arr.length; i++) {

            if (arr[i].equals(arr[i - 1])){
                System.out.print(arr[i] + " ");
            }

            else{
                System.out.printf("\n%s ", arr[i]);
            }
        }
    }
}
