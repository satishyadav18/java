public class Practice{

    // static int max(int x, int y){

    // int max(int x, int y){   //formal parameter
    //     if(x>y){      
    //         return x;
    //     }
    //     else{
    //         return y;
    //     }
    // }


    static void inc(int x){
        x++;
        System.out.println(x);
    }


    public static void main(String[] args){
        int a = 10, b=15;         // actual parameter

        // System.out.println(max(a, b));

        // Practice p = new Practice();    //object of class is created (so static is not required)
        // System.out.println(p.max(a, b));


        inc(a);
        System.out.println(a);

    }
}