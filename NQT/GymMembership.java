import java.util.Scanner;

class GymMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int duration = sc.nextInt(); // duration in months
        int cost;

        switch (duration) {
            case 1:
                cost = 2000;
                break;
            case 3:
                cost = 5000;
                break;
            case 6:
                cost = 9000;
                break;
            case 9:
                cost = 12000;
                break;
            case 12:
                cost = 15000;
                break;
            default:
                System.out.println("Invalid Input");
                return;
        }

        System.out.println(cost);
    }
}



// import java.util.Scanner;

// public class GymMembership {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take input as StringBuffer
//         StringBuffer sb = new StringBuffer(sc.nextLine());

//         int duration;
//         try {
//             duration = Integer.parseInt(sb.toString());
//         } catch (Exception e) {
//             System.out.println("Invalid Input");
//             return;
//         }

//         int cost;

//         switch (duration) {
//             case 1:
//                 cost = 2000;
//                 break;
//             case 3:
//                 cost = 5000;
//                 break;
//             case 6:
//                 cost = 9000;
//                 break;
//             case 9:
//                 cost = 12000;
//                 break;
//             case 12:
//                 cost = 15000;
//                 break;
//             default:
//                 System.out.println("Invalid Input");
//                 return;
//         }

//         System.out.println(cost);
//     }
// }