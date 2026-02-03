public class Automorphic{
    static void isAutomorphic(int n){
        int square = n * n;
      

        while(n > 10){
            if(n % 10 != square % 10){
                System.out.println("Not Automorphic!!");
            }else{
                System.out.println("Automorphic!!");
            }
            n /= 10;
            square /= 10;
        }
        
    }

    public static void main(String[] args){
        Automorphic.isAutomorphic(26);
    }
}