
import java.util.*;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //take input till user does not press 'x' or 'X'.
        int ans = 0;
        while(true){
            //take operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/'|| op == '%' ){
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    ans = num1 / num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid input!!!");
            }
            System.out.println(ans);
        }

        in.close();
    }
}
