
import java.util.*; 

class While_loop_2table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

    int i = 1;
    System.out.println("Table of 2 is: ");
    while(i <= n){
        System.out.println(i * 2);
        i++;
    }
    sc.close();
    }
}