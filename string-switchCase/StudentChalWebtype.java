package myjava;

import java.util.Scanner;

public class StudentChalWebtype {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the Domain: ");
        String domain = in.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".")+1);

        switch (ext) {
            case "com": System.out.println("commercial");
                break;
            case "org": System.out.println("organisation");
                break;
            case "gov": System.out.println("government");
                break;
            case "net": System.out.println("Network");
                break;
            default: System.out.println("invalid input");
                break;
        }
        in.close();
    }
}
