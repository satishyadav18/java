
public class BitwiseOp {
    public static void main(String[] args) {
        // int x = 10; 
        // int y = 6; 
        // int z;
        
        // z = x & y; 
        // System.out.println(z);

        int x = 0b1010; 
        int y = 0b0110; 
        int z = -0b0111;
        
        int p = x & y; 
        int q = x ^ y;
        int r = ~x;
        int s = x | y;
        int t = x << 2;
        int u = y >> 1;
        int v = z >>> 1;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        System.out.println(String.format("%32s",Integer.toBinaryString(v)));
        System.out.println(u);
    }
}
