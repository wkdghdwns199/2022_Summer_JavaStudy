import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


public class YourClass{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int resultAdder=0;
        int resultSubtractor=Integer.parseInt(args[0]);

        for (int i=0; i<args.length; i++){
            resultAdder += Integer.parseInt(args[i]);
        }
        

        for (int i=1; i<args.length; i++){
            resultSubtractor -= Integer.parseInt(args[i]);
        }
        
        
        bw.write("출력: "+ resultAdder + "\n");
        bw.write("출력: "+ resultSubtractor + "\n");
        bw.flush();
        bw.close();
    }
}