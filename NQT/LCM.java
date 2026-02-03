public class LCM{
    static void leastFactor(int n1, int n2){
       int a = n1; 
       int b = n2;
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        System.out.println("HCF: "+n1);

        int lcm = (a * b) / n1;
        System.out.println("LCM: "+lcm);
        
        
    }
    public static void main(String[] args){
        LCM.leastFactor(5, 15);
    }
}