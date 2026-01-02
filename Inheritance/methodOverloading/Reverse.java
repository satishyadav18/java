class Rev{
    int rever(int n){
        int temp = Math.abs(n); 
        int rem;
        int rev = 0;

        while(temp > 0){
            rem = temp % 10;
            rev = 10 * rev + rem;
            temp = temp / 10;
        }
        return n < 0 ? -rev : rev;
    }
    
    void rever(int A[]){
        int B[] = new int[A.length];
        for(int i=A.length-1, j=0; i>=0; i--, j++){
            B[j] = A[i];
        }

        System.out.println("Reverse Copied Array is: ");
        for(int y : B){
            System.out.print(y+",");
        }
    }
}


public class Reverse{
    public static void main(String[] args){
        Rev r = new Rev();
        int R = r.rever(-6598);
        System.out.println("Reversed number is: "+R);

        int A[] = {23, 32, 56, 78, 90};
        r.rever(A);

    }
}