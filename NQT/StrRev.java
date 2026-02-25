// public class StrRev{
//     public static String reverse(String s){
//         String rev = "";
//         for(int i = s.length() - 1; i >= 0; i--){
//             rev += s.charAt(i);
//         }
//         return rev;
//     }

//     public static void main(String[] args){
//         System.out.println(reverse("hello")); // olleh
//         System.out.println(reverse("world")); // dlrow
//     }
// }



public class StrRev{
    // public static void reverse(String s){
    //     StringBuilder sb = new StringBuilder(s);
    //     sb.reverse().toString();
    //     System.out.println(sb);
    // }

    public static void main(String[] args){
        // reverse("hello, I am Satish.");

        
        String s = "Hello, I am Satish.";
        String sb = new StringBuilder(s).reverse().toString();
        System.out.println(sb);

    }
}
