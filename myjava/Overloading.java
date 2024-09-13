import java.util.Arrays;

public class Overloading{
    public static void main(String[] args){
        fun(18);
        fun("Virat");

        demo(1, 7, 9, 56, 78, 34, 56, 67, 89);
        demo("Satish", "Suraj", "Sahil", "Anuj", "Boby");
    }

    static void fun(int s){
        System.out.println(s);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}