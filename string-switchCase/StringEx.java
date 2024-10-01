import java.util.Scanner;

public class StringEx{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.nextLine();

        String personalized = myGreet(naam);
        System.out.println(personalized);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}