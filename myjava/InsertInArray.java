import java.util.*;

class InsertInArray{
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
       
        System.out.print("Enter the number and index to insert: ");
        int num = in.nextInt();
        int index = in.nextInt();

        for(int i = x; i > index; i--){
            A[i] = A[i-1];
        }
        A[index] = num;

        for(int i = 0; i < x+1; i++){
            System.out.print(A[i] + ",");
        }

    }
}