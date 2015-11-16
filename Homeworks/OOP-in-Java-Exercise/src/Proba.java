import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Proba {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("OOP", "Java", "class");

        System.out.println(strings);

        List<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3));

       // nums.add("Hello");

        ((List)nums).add("Hello");
        System.out.println(nums);
    }
}
