
class MiddleArray{
    public static void nextElement(String arr[]){
        int len = arr.length;
        int mid = len / 2;
        for(int i=0; i<mid; i++){
            System.out.print(arr[i] + ", ");
            System.out.print(arr[i + mid]);
            if(i != mid-1){
                System.out.print(", ");
            }
        
        }
       
        
    }

    public static void main(String[] args) {
        String arr[] = {"1","2","3","a","b","c"};
        MiddleArray.nextElement(arr);
    }
}