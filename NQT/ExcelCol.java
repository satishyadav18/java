
import java.util.Scanner;


public class ExcelCol{

    public static int colNum(String col){
        int result = 0;

        for(int i=0; i<col.length(); i++){
            char ch = col.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }

        return result;
    }


    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);   

     System.out.println("Enter the Column Value: ");
     String col = sc.nextLine();

     System.out.println(colNum(col));
    }
}