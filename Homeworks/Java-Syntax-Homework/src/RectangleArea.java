import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Integer width = sc.nextInt();
        Integer height = sc.nextInt();

        int area = width * height;

        System.out.printf("%d", area);
    }
}

