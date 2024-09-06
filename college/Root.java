
import java.util.*;
public class Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        
        double root1, root2;
        double determinant = (b * b - 4 * a * c);
        System.out.println("determinant is ="+determinant);

        if(determinant > 0){
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.printf("root1= %.2f, root2 = %.2f ", root1 , root2);
        }
        else if(determinant  == 0){
            root1 = root2 = -b / (2 * a);
            System.out.printf("root1 = root2 = %.2f;", root1);
        }
        else{
            double real =  -b / (2 * a);
            double imaginary =  Math.sqrt(-determinant) / (2 * a);
            System.out.printf("Complex root1 = %.2f+%.2fi", real, imaginary);
            System.out.printf("\nComplex root2 = %.2f-%.2fi", real, imaginary);
        }

        sc.close();
    }
}
