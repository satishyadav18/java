import java.util.*;

public class CharFreq {
    public static Map<Character, Integer> freq(String s) {
        //Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map = new TreeMap<>(); //Alphabetically


        for (char c : s.toCharArray()) {
            if (c == ' ') continue;           // ignore spaces
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(freq("hello world"));
    }
}
