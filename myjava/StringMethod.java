package myjava;


public class StringMethod {
    public static void main(String[] args) {
        String str1 = "   SatishYadav  ";
        String str = "neatbeans";

        String str2 = str1.toUpperCase();

        String str3 = str.substring(4);
        String str3_1 = str.substring(1,5);

        String str4 = str1.replace('S', 'A');

        int len = str1.length();
        System.out.println(len);

        System.out.println(str1.toLowerCase() == str2);
        System.out.println(str2);
        System.out.println(str1.trim());
        System.out.println(str3);
        System.out.println(str3_1);
        System.out.println(str4);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        String s = "www.satish&brother.com";
        
        // boolean e = s.endsWith("com");
        // System.out.println(e);
        
        boolean b = s.startsWith("www");
        System.out.println(s.endsWith("com"));
        System.out.println(b);

        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }

        System.out.println(s.charAt(5));
        System.out.println(s.indexOf("tis"));
        System.out.println(s.indexOf("o", 14)); // if searched string or character is not present then it will return -1
        
        System.out.println(s.lastIndexOf("."));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        String p = "Python";
        String q = "Python";
        String r = "Neatbeans";

        System.out.println(p.equals(q));
        System.out.println(q.equalsIgnoreCase(r));
        System.out.println(r.compareTo(p));
        System.out.println(r.compareToIgnoreCase(str));


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        // String n = "hello";
        System.out.println(String.valueOf(5));

        String x = "The Full Stack Java" ;
        String y = " Developer";

        System.out.println(x.contains("Full"));
        System.out.println(x.concat(y));

    }
}
