import java.util.*;
class AP{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the starting term: ");
        int a = in.nextInt();
        
        System.out.println("Enter the common differnce: ");
        int d = in.nextInt();

        System.out.println("Enter the number of terms: ");
        int n = in.nextInt();

        // AP Series -> a + ad + a2d + a3d + a4d + ..........

        int i = 0;
        int term = a;
        while(i<n){
            System.out.print(term+",");
            term = (term + d);
            i++;
        }
    }
}