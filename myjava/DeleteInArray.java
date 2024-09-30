import java.util.*;

class DeleteInArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A[] = new int[10];

        A[0] = 5;
        A[1] = 9;
        A[2] = 4;
        A[3] = 7;
        A[4] = 2;
        A[5] = 8;

        int x = 6;  //number of elements in array
        for(int i = 0; i < x; i++){
            System.out.print(A[i] + ",");
        }
        System.out.println("");
       
        System.out.print("Enter the number and index to delete: ");
        int num = in.nextInt();
        int index = in.nextInt();

        A[index] = A[index+1];
        for(int i = index+1; i < x; i++){
            A[i-1] = A[i];
        }

        for(int i = 0; i < x-1; i++){
            System.out.print(A[i] + ",");
        }

    }
}