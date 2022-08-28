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
       
        String inputCalculationString;
        String[] inputStringToNumberArray;
        

        try{
            inputCalculationString = args[0]; 
            inputStringToNumberArray = inputCalculationString.split("\\+");
        }
        catch (Exception e){
            inputCalculationString="0";
            inputStringToNumberArray = inputCalculationString.split("\\+");
        }
        
        
        if (setModeForConsoleInput.equals("on")){
            bw.write("입력: ");
            bw.flush();
            inputCalculationString = br.readLine();
            
            
            if (!(inputCalculationString.equals(""))){
                inputStringToNumberArray = inputCalculationString.split("\\+");
            }
            else {
                inputStringToNumberArray = "0".split("\\+");
            }
        }

        int resultAdder=0;
        int errorOccuredCheck=0;
        for (int i=0; i<inputStringToNumberArray.length; i++){
             try{
                resultAdder += Integer.parseInt(inputStringToNumberArray[i]);
             }
             catch (NumberFormatException e){
                String[] tempMinusNumbers = inputStringToNumberArray[i].split("-");
                try{
                    resultAdder += Integer.parseInt(tempMinusNumbers[0]) - Integer.parseInt(tempMinusNumbers[1]); 
                }
                catch (NumberFormatException e2){
                    if (!(inputStringToNumberArray[i].contains("*") && !(inputStringToNumberArray[i].contains("/")) && !(inputStringToNumberArray[i].contains("%")))){
                        bw.write("출력: 숫자가 아닌 문자가 입력되었습니다! > "+inputStringToNumberArray[i]+"\n");
                        bw.flush();
                    }
                    else {
                        bw.write("출력: 지원하지 않는 연산자가 입력되었습니다! > "+inputStringToNumberArray[i]+"\n");
                        bw.flush();
                    }
                    
                    errorOccuredCheck=1;
                }
             }
         }
        
        

        // input numbers at command line without character array
        // for (int i=0; i<args.length; i++){
        //     resultAdder += Integer.parseInt(args[i]);
        // }
        

        // for (int i=1; i<args.length; i++){
        //     resultSubtractor -= Integer.parseInt(args[i]);
        // }
        
        
        if (errorOccuredCheck==0 && (resultAdder >= 0 || setModeForPrintMinus.equals("off"))) {
            bw.write("출력커스텀1: "+ resultAdder + "\n");
            bw.write("출력커스텀2: 정답은 "+ resultAdder + "입니다\n");
            bw.write("출력커스텀3: " + inputCalculationString + " 의 정답은 " + resultAdder + "입니다\n");
            
        
            bw.flush();
            bw.close();
        }
        else if (setModeForPrintMinus.equals("on")){
            bw.write("결과 값이 음수입니다. 음수 결과 값을 보시고 싶으시면 출력 모드를 변환해 주세요!\n");
            bw.flush();
        }
    }
}