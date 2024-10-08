public class Practice{

  
    static byte max(byte x, byte y){
        return x > y ? x : y;
    }
  
    static int max(int x, int y){
        return x > y ? x : y;
    }
                                //single float type method can be used for both int and float
    static float max(float x, float y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }

    public static void main(String[] args){

        byte a=19, b=24;

        System.out.println(max(a,b));

        System.out.println(max(10, 5));

        System.out.println(max(5.25f, 7.8f));
    }
}