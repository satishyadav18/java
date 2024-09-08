import java.util.*;

class IsArmstrong {
//  check if a number is an Armstrong number
    public boolean isArmstrong(int num) {
        int temp = num;
        int rem;
        int sum = 0;

        int count = 0;
        while(temp > 0){
            temp /= 10;
            count++;
        }

        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }
        return sum == num;
    }
}

class ArmstrongNum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

     // instance of the IsArmstrong class
        IsArmstrong a = new IsArmstrong();

        if(a.isArmstrong(num)){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }

        in.close();
    }
}





// class ArmstrongNum{
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = in.nextInt();

//         int temp = num;
//         int rem;
//         int sum = 0;
//         while(temp > 0){
//             rem = temp % 10;
//             sum += rem * rem * rem; 
//             temp /= 10;
//         }
//         System.out.println(sum);
//         if(sum == num){
//             System.out.println("Armstorng number");
//         }
//         else{
//             System.out.println("Not a Armstrong number");
//         }

//         in.close();
//     }
// }