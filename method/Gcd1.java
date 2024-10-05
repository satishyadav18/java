

class hcf{
    int CalGcd(int num1, int num2){
        while (num1 != num2) {
          if(num1 > num2){
            num1 = num1 - num2;
          }
          else{
            num2 = num2 - num1;
          }
        }
        return num1;
    }
}

public class Gcd1{
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        hcf g = new hcf();
        int gcd = g.CalGcd(num1, num2);
        System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd);
    }    
}

