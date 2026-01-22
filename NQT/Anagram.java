

public class Anagram{

    static boolean isAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()) return false;

        // char[] a = s1.toCharArray();
        // char[] b = s2.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // return Arrays.equals(a,b);

        int[] count = new int[26];

        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for(int j : count){
            if(j != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args){
        String s1 = "Silept";
        String s2 = "Listen";
       
        // if(isAnagram(s1, s2)){
        //     System.out.println("Anagram");
        // }else{
        //     System.out.println("Not Anagram");
        // }

        System.out.println(isAnagram(s1, s2) ? "Anagram" : "Not Anagram");

    }
}