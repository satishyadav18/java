
import java.util.*;

public class FahToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        double f = sc.nextDouble();
        double C = (f-32)/1.8;
        System.out.println(f+" degree fahrenheit = "+C+" degree Celsius.");
    
        sc.close();
    }    
}
