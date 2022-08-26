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
        for (int i=0; i<args.length; i++){
            resultAdder += Integer.parseInt(args[i]);
        }
        
        bw.write("출력: "+ resultAdder);
        bw.flush();
        bw.close();
    }
}