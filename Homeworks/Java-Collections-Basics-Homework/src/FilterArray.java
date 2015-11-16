import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] text = sc.nextLine().split(" ");

       // Arrays.stream(text);

        List<String> output = Arrays.stream(text).filter(x -> x.length() > 3).collect(Collectors.toList());



        for (Object filterPrint : output){
            System.out.print(filterPrint + " ");
        }


    }
}
