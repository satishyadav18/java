// import java.util.*;

// public class CharFreq {
//     public static Map<Character, Integer> freq(String s) {
//         //Map<Character, Integer> map = new HashMap<>();
//         Map<Character, Integer> map = new TreeMap<>(); //Alphabetically


//         for (char c : s.toLowerCase().toCharArray()) {
//             if (c == ' ') continue;           // ignore spaces
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }
//         return map;
//     }

//     public static void main(String[] args) {
//         System.out.println(freq("heLLo world"));
//     }
// }


import java.util.*;
public class CharFreq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        input = input.toLowerCase(); // Convert to lowercase
        Map<Character, Integer> freq = new TreeMap<>();  //Freq of alphabets:{a=5, g=3, h=3, i=3, j=1, l=1, o=3, s=3}

       // Map<Character, Integer> freq = new HashMap<>();  //Freq of alphabets:{a=4, s=2, d=2, u=1, f=1, g=1, h=1, k=1, l=1}  

        for(char c : input.toCharArray()){
            if(c == ' ') continue;
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Freq of alphabets:" + freq);

    }
}