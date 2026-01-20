import java.util.*;

class nQT{
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array [n X m]: ");

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("Enter element at position [%d][%d]: ", i, j); 
                arr[i][j] = in.nextInt();
            }
        }

        Arrays.toString(arr);

        System.out.println("Inserted elements are: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf(arr[i][j] + " ");
            }
        System.out.println();
        }







        // int n = in.nextInt();
        // int[] arr  = new int[n];
        // System.out.println("Enter the elements: ");
        // for(int i = 0; i < n; i++){
        //     arr[i] = in.nextInt();
        // }

        // Arrays.sort(arr);

        // System.out.println("Inserted elements are: ");
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        // }


        in.close();
    }
}