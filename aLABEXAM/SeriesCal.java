//Write a program to determine sum of the following series for given value of n:
//1 - 1/2^2+ 1/3^2- ..... + 1/n^2

import java.util.*;
public class SeriesCal{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();

        double sum = 0.0;

        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                sum -= 1.0/(i*i);
            }
            else{
                sum += 1.0/(i*i);
            }       
        }     
        System.out.println("Sum is: "+ sum);
    }
}