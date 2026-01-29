//Using BufferReader to take input

import java.io.BufferedReader;
import java.io.InputStreamReader;

class EncryDecry {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input possible keys
        String[] keys = br.readLine().split(" ");

        // Input encrypted numbers
        String[] nums = br.readLine().split(" ");
        int[] encrypted = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            encrypted[i] = Integer.parseInt(nums[i]);
        }

        int min = encrypted[0], max = encrypted[0];
        for (int x : encrypted) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        int key = 0;
        for (String s : keys) {
            int k = s.charAt(0) - 'A' + 1;
            if (k >= max - 26 && k <= min - 1) {
                key = k;
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int e : encrypted) {
            int val = e - key;
            result.append((char) ('A' + val - 1));
        }

        System.out.println(result.toString());
    }
}



// import java.util.*;

// class EncryDecry {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input possible keys (space separated, e.g. A Y B T C)
//         String[] keys = sc.nextLine().split(" ");

//         // Input encrypted numbers (space separated)
//         String[] nums = sc.nextLine().split(" ");
//         int[] encrypted = new int[nums.length];

//         for (int i = 0; i < nums.length; i++) {
//             encrypted[i] = Integer.parseInt(nums[i]);
//         }

//         // Find min and max encrypted values
//         int min = encrypted[0], max = encrypted[0];
//         for (int x : encrypted) {
//             min = Math.min(min, x);
//             max = Math.max(max, x);
//         }

//         // Find valid key
//         int key = 0;
//         for (String s : keys) {
//             char ch = s.charAt(0);
//             int k = ch - 'A' + 1;

//             if (k >= max - 26 && k <= min - 1) {
//                 key = k;
//                 break;
//             }
//         }

//         // Decrypt
//         StringBuilder result = new StringBuilder();
//         for (int e : encrypted) {
//             int val = e - key;
//             result.append((char) ('A' + val - 1));
//         }

//         // Output
//         System.out.println(result.toString());
//     }
// }



