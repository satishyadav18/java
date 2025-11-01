import java.util.*;

class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            long n = sc.nextLong(); // number of people
            long handshakes = (n * (n - 1)) / 2; // each pair shakes once
            System.out.println(handshakes);
        }
        
        //sc.close();
    }
}
