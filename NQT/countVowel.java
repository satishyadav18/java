
import java.util.Scanner;

public class countVowel{

    public static int countVowels(String s){
        int count = 0;
        s = s.toLowerCase();
        //int n = s.length();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }
    

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = in.nextLine();

        System.out.println("No. of vowels in the given string: "+countVowels(str));
        
    }
}