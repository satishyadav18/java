class Area{
    // int Rect(int x, int y){
    //     if(x > 0 && y > 0){
    //         return x*y;
    //     }
    //     else{
    //         return -1;
    //     }
    // }

    // int Sqr(int s){
    //     if(s > 0){
    //         return s*s;
    //     }
    //     else{
    //         return -1;
    //     }
    // }

    int Rect(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        return x * y;
    }

    int Sqr(int s) {
        if (s <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        return s * s;
    }

    double Cir(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        return Math.PI * r * r;
    }

}


public class Areas{
    public static void main(String[] args){

        Area a = new Area();
        
        int R = a.Rect(5, 6);
        System.out.println("Area of Rectangle is: "+R+" Sq. unit");

        int S = a.Sqr(8);
        System.out.println("Area of Square is: "+S+" Sq. unit");

        double C = a.Cir(7);
        System.out.println("Area of Circle is: "+C+" Sq. unit");
    }
}