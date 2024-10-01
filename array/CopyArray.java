import java.util.*;

class CopyArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A[] = new int[6];
        System.out.println("Enter the number of elements (not mmore than 6): ");
        int n = in.nextInt();

        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            A[i] = in.nextInt();
        }

        System.out.println("Original Array is: ");
        for(int x : A){
            System.out.print(x+",");
        }
        System.out.println("");

        int B[] = new int[A.length];
        for(int i=0; i<A.length; i++){
            B[i] = A[i];
        }

        System.out.println("Copied Array is: ");
        for(int y : B){
            System.out.print(y+",");
        }

    }
}