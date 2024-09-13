import java.util.Arrays;

public class VarArgs{
    public static void main(String[] args){
        fun(2, 3, 4, 55, 66, 57, 89, 97, 24);
        multiple(2, 5, "Satish", "Manish", "Anish");
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
         // System.out.println(v);
         
        System.out.println(Arrays.toString(v));
    }
}