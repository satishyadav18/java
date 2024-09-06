
class fibbo{
    int fib(int n){
        if(n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }
}


//commandline input
public class Fibo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        fibbo f = new fibbo();
        System.out.println("Fibonacci series up to " + n + " terms:");
        for(int i=0; i<=n; i++){
            System.out.println(f.fib(i)+"");
        }
    }
}
