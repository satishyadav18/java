package college;

public class SimpleIntrest {
    public static void main(String[] args) {
        if (args.length != 3) {
           // System.out.println("Please provide exactly 3 arguments: principal, rate, and time.");
            return;
        }

        float p = Float.parseFloat(args[0]);
        float r = Float.parseFloat(args[1]);
        float t =  Float.parseFloat(args[2]);
        double si = (p * r * t) / 100.0;
        System.out.println("Simple interest is: " + si);
    }
    
    
}
