import java.util.Scanner;

class InArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter the elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        // System.out.println("The elements in array are: ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        for(int x : arr){
            System.out.print(x+" ");
        }
       
    }
}