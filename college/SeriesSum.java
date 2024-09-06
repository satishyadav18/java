
import java.util.*;

public class SeriesSum {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        for(double i=1; i<=n*n; i++){
            sum += (1.0/i);
        }
        System.out.printf("Sum of series is: %.2f%n", sum);

        in.close();
    }
}
