import java.util.Scanner;

public class NoOfSundays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of starting day: ");
        String startDay = sc.nextLine();

        System.out.println("Enter the number of days in the month: ");
        int numDays = sc.nextInt();

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int startIndex = 0;

        for(int i=0; i<7; i++){
            if(daysOfWeek[i].equalsIgnoreCase(startDay)){
                startIndex = i;
                break;
            }
        }

        int sundayCount = 0;
        for(int i=0; i<numDays; i++){
            if((startIndex + i) % 7 == 0){
                sundayCount++;  
            }
        }
        System.out.println("Number of Sundays in the month: " + sundayCount);
    }
}