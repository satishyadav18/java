package college;

public class PrintingPrac {
    public static void main(String[] args) {
        int a = 20; 
        int b = -18;
        float c = 124.45f;
        System.out.printf("%d\n", a);
        System.out.printf("%+d\n", a);
        System.out.printf("%5d\n", a);
        System.out.printf("%05d\n", a);
        System.out.printf("%(d\n", b);
        System.out.printf("%+d\n", b);
        System.out.printf("%f\n", c);
        System.out.printf("%6.2f\n", c);

        //string

        String str1 = "java";
        System.out.printf("%20s\n", str1);
        System.out.printf("%-20s", str1);

    }
}
