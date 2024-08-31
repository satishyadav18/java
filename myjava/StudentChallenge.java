package myjava;

public class StudentChallenge {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        String username = str.substring(0, i);
        String domain = str.substring(i+1, str.length());

        System.out.println("UserName: "+username);
        System.out.println("Domain: "+domain);
        
        System.out.println(domain.startsWith("gmail"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        int b = 10010110;
        String str1 = b+"";   //String.vlaueOf(b);

        boolean a = (str1.matches("[01]+"));
        if( a == true){
            System.out.println("Binary number");
        }else{
            System.out.println("Not a binary number");
        }

        String h = "E1234ACF";
        
        boolean d = (h.matches("[0-9A-F]+"));
        if( d == true){
            System.out.println("Hexadecimal number");
        }else{
            System.out.println("Not a Hexadecimal number");
        }

        String date = "24/10/2003";

        boolean m = date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}");

        if(m == true){
            System.out.println("Date format");
        }
        else{
            System.out.println("Wrong format!!!");
        }
        
        String str5 = "a!B@c#1$2%3&";
        String res = str5.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(res);

        String space = "       abd        vfds   ofjk        ";
        space = (space.replaceAll("\\s+", " ").trim());

        String words[] = space.split("\\s");
        System.out.println(words.length);
    }
}
