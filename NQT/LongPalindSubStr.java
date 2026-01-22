public class LongPalindSubStr{
    
    static boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static String longestPalindrome(String s){
        int n = s.length();
        String longest = "";

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(isPalindrome(s, i, j)){
                    String sub = s.substring(i, j+1);
                    if(sub.length() > longest.length())
                        longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args){
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}