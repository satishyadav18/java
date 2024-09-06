
public class Gcd {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        hcf g = new hcf();
        int gcd = g.CalGcd(num1, num2);
        System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd);
    }    
}

class hcf{
    int CalGcd(int num1, int num2){
        while (num2 != 0) {
            int temp = num2;
            num2= num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
