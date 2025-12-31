class facto{
    int fact(int n){
        if(n == 0) return 1;
        else return (n*fact(n-1));
   }
}
public class Factorial{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
      
        // Create an instance of the facto class
        facto f = new facto();

        // Call the fact method with the input number
        int p = f.fact(n);
        System.out.println("Factorial is :"+p);
    }
}


