import java.util.*;


class maxArr{
    int max1(int arr[]){

        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
       return max;
    }
}



public class Max{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int arr[] = new int[8];
        System.out.print("Enter the elements (not more than 8): ");

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        maxArr a = new maxArr();
        int res = a.max1(arr);
        System.out.println("Max element in array is: "+res);
    }
}