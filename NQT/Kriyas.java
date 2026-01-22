
import java.util.Scanner;


public class Kriyas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enten m value: ");
        int m = sc.nextInt();
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        int maxResult;
        if(n % 2 == 0){
            maxResult = (n/2)*((n/2)+1)*m;
        }
        else{
            maxResult = ((n-1)/2)*(((n-1)/2)+2)*m;
        }
        System.out.print("MaxResult : "+maxResult);
    }
}