import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("(?<user>\\w*[._]*\\-*\\w*)\\@(?<host>\\w*)([._]*\\w*[.-_]*[a-zA-Z]{2,})");

        Matcher matcher =  pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
