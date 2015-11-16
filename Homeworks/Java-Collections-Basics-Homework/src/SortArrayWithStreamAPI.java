import com.sun.xml.internal.ws.util.StreamUtils;
import javafx.beans.binding.ObjectExpression;

import java.util.*;
import java.util.stream.Collectors;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split(" ");

        String sort = sc.nextLine();

        if (sort.equals("Ascending")){
            List<Integer> output = Arrays.stream(numbers).map(Integer::parseInt).sorted()
                    .collect(Collectors.toList());

            for (Object items : output){
                System.out.print(items + " ");
            }
        }else if (sort.equals("Descending")){
            List<Integer> output = Arrays.stream(numbers).map(Integer::parseInt).sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            for (Object items : output){
                System.out.print(items + " ");
            }
        }


    }
}
