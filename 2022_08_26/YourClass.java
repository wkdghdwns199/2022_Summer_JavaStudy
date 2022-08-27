import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


public class YourClass{    

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        bw.write("콘솔 입력 모드: ");
        bw.flush();

        String setModeForConsoleInput = br.readLine();

        bw.write("음수 결과값 출력 방지 모드: ");
        bw.flush();

        String setModeForPrintMinus = br.readLine();
       
        String[] inputStringToNumberArray;
        

        try{
             inputStringToNumberArray = args[0].split("\\+");
         }
        catch (Exception e){
            bw.write("입력: ");
            bw.flush();
            inputStringToNumberArray = br.readLine().split("\\+");
            setModeForConsoleInput="off";
        }
         

        
        if (setModeForConsoleInput.equals("on")){
            bw.write("입력: ");
            bw.flush();
            inputStringToNumberArray = br.readLine().split("\\+");
        }

           

        int resultAdder=0;
        int resultSubtractor=Integer.parseInt(inputStringToNumberArray[0]);

        for (int i=0; i<inputStringToNumberArray.length; i++){
             resultAdder += Integer.parseInt(inputStringToNumberArray[i]);
         }
        

        for (int i=1; i<inputStringToNumberArray.length; i++){
            resultSubtractor -= Integer.parseInt(inputStringToNumberArray[i]);
        }
        

        // input numbers at command line without character array
        // for (int i=0; i<args.length; i++){
        //     resultAdder += Integer.parseInt(args[i]);
        // }
        

        // for (int i=1; i<args.length; i++){
        //     resultSubtractor -= Integer.parseInt(args[i]);
        // }
        
        
        if (resultAdder >= 0 || setModeForPrintMinus.equals("off")) bw.write("출력: "+ resultAdder + "\n");
        if (resultSubtractor >= 0 || setModeForPrintMinus.equals("off")) bw.write("출력: "+ resultSubtractor + "\n");
        bw.flush();
        bw.close();
    }
}