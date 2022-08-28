import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
public class MyCalculator extends YourClass{
    
    public static void main(String[] args) throws IOException{
        YourClass cal = new YourClass();
        String getInputString = cal.inputString(args);
        String[] numberString = cal.inputCalculation(args[0]);
        String resultString = cal.calculate(numberString);

        System.out.println(printResults(getInputString,resultString));
        
    }
    

    
    public static String printResults(String inputCalculationString, String resultString){


        int resultAdder;
        try {
            resultAdder = Integer.parseInt(resultString);
        }
        catch(NumberFormatException e){
            return resultString;
        }

        if (resultAdder >= 0) {
            resultString = "출력커스텀1: "+ resultAdder + "\n";
            resultString += "출력커스텀2: 정답은 "+ resultAdder + "입니다\n";
            resultString += "출력커스텀3: " + inputCalculationString + " 의 정답은 " + resultAdder + "입니다\n";
        }
        else if (resultAdder < 0){
            resultString = "출력커스텀1: 0\n";
            resultString += "출력커스텀2: 지원하지 않는 연산자입니다.\n";
            resultString += "출력커스텀3: " + inputCalculationString + " 지원하지 않는 연산자입니다.\n";
            
        }

        return resultString;
    }

}