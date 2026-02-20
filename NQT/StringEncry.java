
import java.util.Scanner;

public class StringEncry{

    static String encryption(String s, int key){
        StringBuilder ans = new StringBuilder();
        if(key < 0){
            return "Invalid input";
        }
        for(int i=0; i<s.length(); i++){
            //sbdg241
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                char newVal = (char) ((((ch - '0')+key)%10)+'0'); 
                ans.append(newVal);
            }
            else if(ch >= 'a' && ch <= 'z'){
                char newVal = (char) ((((ch - 'a')+key)%26)+'a'); 
                ans.append(newVal);
            }
            else if(ch >= 'A' && ch <= 'Z'){
                char newVal = (char) ((((ch - 'A')+key)%26)+'A'); 
                ans.append(newVal);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        String ans = encryption(s, key);
        System.err.println(ans);
        sc.close();
    }
}