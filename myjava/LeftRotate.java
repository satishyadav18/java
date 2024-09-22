public class LeftRotate{
    public static void main(String[] args){

        int[] arr = {3,6,4,7,9,8,11,15,45,56,32,78};

        for(int x : arr){
            System.out.print(x+",");
        }
        System.out.println("");
        
        int temp = arr[0];

        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        for(int x : arr){
            System.out.print(x+",");
        }



        //Right Rotation 

        //  for(int x : arr){
        //     System.out.print(x+",");
        // }
        // System.out.println("");
        
        // int temp = arr[arr.length-1];

        // for(int i=arr.length-1; i>0; i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[0] = temp;

        // for(int x : arr){
        //     System.out.print(x+",");
        // }

    }
}