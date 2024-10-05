public class TwoSum{
    public static void main(String[] args){

        // int A[] = {2, 7, 11, 15};

        // int target = 9;

        
        int A[] = {2,5,5,11};

        int target = 10;

        for(int i=0; i<A.length-1; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i]+A[j] == target){
                    System.out.println("["+i+","+j+"]");
                }
            } 
        }
    }
}