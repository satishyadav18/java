import java.util.*;

public class SecondMax{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[8];
        System.out.print("Enter the elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int max1, max2;
        max1=max2=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        System.out.println("max is:"+max1+" second max is: "+max2);
    }
}