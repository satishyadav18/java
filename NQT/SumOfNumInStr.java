
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SumOfNumInStr{

    static int sumOfNum(String str){
        int num = 0;
        int sum = 0;

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }else{
                sum += num;
                num = 0;
            }
        }
        return sum + num;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Alphanumeric string: ");
        String str = br.readLine();

        System.out.println(sumOfNum(str));
    }
}