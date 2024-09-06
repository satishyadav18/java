
public class IntegerRange {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.BYTES);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.BYTES);

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.BYTES);

        //unicode for hindi alphabets.
        for(char c=0x0900; c<=0x0970; c++ ){
            System.out.println(c);
        }

    }
}
// javap java.lang.Integer
// java java.lang.Byte....Short...Float....Boolean
