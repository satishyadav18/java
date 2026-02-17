
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Abundant{

    static boolean isAbundantNum(int n){
        int sum = 0;
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        return sum > n;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");

        int num = Integer.parseInt(br.readLine());

        System.out.println(Abundant.isAbundantNum(num));
    }
}