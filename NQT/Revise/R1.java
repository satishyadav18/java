import java.util.*;

class R1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String part[] = str.split(",");

        int arr[] = new int[part.length];

        for(int i = 0; i < part.length; i++){
            arr[i] = Integer.parseInt(part[i]);
        }

        for(int i : arr){
            System.out.print(i);
        }
        
    }
}