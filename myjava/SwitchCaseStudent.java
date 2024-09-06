package myjava;

import java.util.Scanner;

public class SwitchCaseStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int day = in.nextInt();

//         switch(day){
//             case 1 : System.out.println("Monday");
//                 break;
//             case 2 : System.out.println("Tuesday");
//                 break;
//             case 3 : System.out.println("Wednesday");
//                 break;
//             case 4 : System.out.println("Thursday");
//                 break;
//             case 5 : System.out.println("Friday");
//                 break;
//             case 6 : System.out.println("Saturday");
//                 break;
//             case 7 : System.out.println("Sunday");
//                 break;
//             default : System.out.println("invalid input");
//                 break;
//         }


//_________________________________________________________________________


    switch(day){
        case 1 -> System.out.println("Jan");
        case 2 -> System.out.println("Feb");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("invalid input");
    }

    in.close();
    }
}



//  switch(day){
//         case 1 : System.out.println("Jan");
//             break;
//         case 2 : System.out.println("Feb");
//             break;
//         case 3 : System.out.println("Wednesday");
//             break;
//         case 4 : System.out.println("Thursday");
//             break;
//         case 5 : System.out.println("Friday");
//             break;
//         case 6 : System.out.println("Saturday");
//             break;
//         case 7 : System.out.println("Sunday");
//             break;
//         default : System.out.println("invalid input");
//             break;
//     }

//     in.close();
//     }
// }