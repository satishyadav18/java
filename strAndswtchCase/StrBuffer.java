public class StrBuffer{
    public static void main(String[] args) {
        // String object
        String str = "Hello";
        System.out.println("Initial String: " + str);
        
        // Attempting to modify the String
        str.concat(" World");
        System.out.println("After modification attempt: " + str);
        
        // StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer: " + sb);
        
        // Modifying the StringBuffer
        sb.append(" World");
        System.out.println("After modification: " + sb);
    }
}