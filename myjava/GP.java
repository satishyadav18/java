import java.util.*;
class GP{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the starting term: ");
        int a = in.nextInt();
        
        System.out.println("Enter the common ratio: ");
        int r = in.nextInt();

        System.out.println("Enter the number of terms: ");
        int n = in.nextInt();

        //GP Series -> a + ar + ar^2 + ar^3 + .........

        int term = a;
        for(int i=0; i<n; i++){
            System.out.print(term+",");
            term = term * r; 
        }
    }
}