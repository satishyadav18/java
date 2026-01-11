
import java.util.*;


public class MoveZero{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        moveZeroesToEnd(arr);
        
        System.out.print("Array after moving zeros to end: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZeroesToEnd(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < arr.length){
            arr[count++] = 0;
        }
    }
}
