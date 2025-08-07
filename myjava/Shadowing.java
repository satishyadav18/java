public class Shadowing{
    static int x = 45; //this will be shadowed at line 9
    public static void main(String[] args){
        System.out.println(x);

        int x; // (local scope) the class variable at line 4 will be shadowed
  
    //    System.out.println(x);  //Scope will begin when value is intialised
        x = 18; 
        System.out.println(x); // 18
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}