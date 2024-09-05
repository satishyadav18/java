
public class StringPrac {
    public static void main(String[] args) {
        // String str1 = "JAVA PROGRAM";
        // String str2 = new String("JAVA");

        // char c[] = {'H', 'e', 'l', 'l', 'o'};
        // String str3 = new String(c);

        // byte b[] = {65, 66, 67, 68};
        // String str4 = new String(b, 2, 2);

        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);
        // System.out.println(str4);

        String str1 = "JAVA";
        // String str2 = "jAVA";
        String str2 = new String("JAVA");

        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c, 0, 3);
       
        byte b[] = {65,66,67,68};
        String str4 = new String(b,1 , 2);


        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1 == str2);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //Regular Expression in String in Java

        String s = "S";
        System.out.println(s.matches(".")); //omly one alphabet for stirng match ex->"A"
        // String t = "%";
        // String t = "abd";
        // System.out.println(t.matches("."));

        // String u = "d";
        // String u = "p";
        // System.out.println(u.matches("[abd]")); //alphbet should only one among the bracke[].

        // String x = "p";
        // System.out.println(u.matches("[^abd]"));  //[^abc] -> means not abc .....expect these any other alphabet can be present.

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        String v = "5";
        System.out.println(v.matches("[A-Za-z0-9]")); // any one either from numbers or alphabets

        // String w = "Ms8";
        // System.out.println(w.matches("[A-Z][a-z][0-9]")); //for three tokens as string 

        // String w = "a";
        // System.out.println(w.matches("a|b")); //anyother symbol other than a or b return false

        // String x = "SATISH";
        // System.out.println(v.matches("SAITHS")); //must be in same order

        String yy = "u";
        System.out.println(yy.matches("\\w"));  // for digits and alphabets

        String jj = "8";
        System.out.println(jj.matches("\\d")); //for digits and \\D -> for not a digit and anything other than digit

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        //Quantifiers 

        String gg = "abc def";
        System.out.println(gg.matches(".*"));  //any character any number of time.
        System.out.println(gg.matches("[a-z]*"));   //without  space 

        System.out.println(">>>>>>>>>>>>>>>>");
        
        String kk = "";
        System.out.println(kk.matches("[abc]*"));   // *-> 0 or any number of times and  //("[abc]+"") + -> atlest 1 or more symbols.

        String ll = "abcd";
        System.out.println(ll.matches("[abcd]{4,7}")); //{4,7} range of the number of the symbols. 

        String pp = "Satish12@gmail.com";
        System.out.println(pp.matches("\\w*@gmail(.*)"));
    }
}
