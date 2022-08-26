import java.util.Arrays;

public class YourClass{
    public static void main(String[] args) {
        int resultAdder=0;
        for (int i=0; i<args.length; i++){
            resultAdder += Integer.parseInt(args[i]);
        }
    }
}