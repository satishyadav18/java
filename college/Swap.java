package college;

public class Swap {
    public static void main(String[] args) {
        int a = 9, b = 12;

         a = a ^ b;  
         b = a ^ b;
         a = a ^ b;

         System.out.println("a: "+a+" b: "+b);

         byte c;
         c = (byte)(9<<4);
         c = (byte)(c|12);
         
        //bitwiswe masking
         System.out.println((c&0b11110000)>>4);
         System.out.println((c&0b00001111));
    }
}
