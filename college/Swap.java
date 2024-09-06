
public class Swap {
    public static void main(String[] args) {
        int a = 9, b = 12;

         a = a ^ b;  
         b = a ^ b;
         a = a ^ b;

         System.out.println("a: "+a+" b: "+b);


        //storing in a single variable

         byte c;
         c = (byte)(9<<4); //shifting and oring to store value
         c = (byte)(c|12);

         
        //bitwiswe masking -> reads the number

        //performing anding for the first 4 binary digits by right shifting >>
         System.out.println((c&0b11110000)>>4); 

         System.out.println((c&0b00001111)); //shifting to retrive value
    }
}
