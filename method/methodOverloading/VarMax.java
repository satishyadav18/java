class Max{
    int max(int ...A){
        if(A.length == 0) return Integer.MIN_VALUE;
        else{
            int m = A[0];
            for(int i=1; i<A.length; i++){
                if(m < A[i]){
                    m = A[i];
                }
            }
            return m;
        }
    }
}


public class VarMax{
    public static void main(String[] args){
        Max M = new Max();
        int Max1 = M.max(12,45,23,24,78,98,56,99);
        int Max2 = M.max(2,4,5,6,9,8,7,1);

        System.out.println("max element is: "+Max1);
        System.out.println("max element is: "+Max2);
    }
}