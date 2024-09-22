import java.util.*;

public class MaxArr{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter the elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

       
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max value is: "+max);
    }
}