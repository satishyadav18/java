import java.util.*;

public class SearchArr{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,8,9,7,45,56,21,35,36,38,79,98,99};
       
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            //sum +=arr[i];
             //System.out.println("Sum is: "+sum);

            if(key == arr[i]){
                System.out.println("Element found at: "+i);
                System.exit(0);
            }
        }
        System.out.println("Element not found!!");       

    }
}