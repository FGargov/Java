
public class Sequence {
    public static int curretValue = -1;

    private Sequence(){
    }

    public static int nextValue(){
        curretValue++;

        return curretValue;
    }
}
