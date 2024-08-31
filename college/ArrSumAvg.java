package college;

import java.util.*;
public class ArrSumAvg {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        double[] arr = new double[n];
        
        System.out.println("Enter the elements in array: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextDouble();
        }
        //System.out.println(arr[2]);

        double sum = 0.0;
        for(double p : arr){
            sum = sum + p;
        }

        double avg = sum / n;
        System.out.println("Sum of number in array is: "+sum+" and average of numbers is: "+avg);

        in.close();
    }
}
