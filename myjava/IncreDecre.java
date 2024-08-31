package myjava;

class IncreDecre{
    public static void main(String[] args) {
        int a = 5 , b = 4 , c;
        c = 2 * a++ + 3 * ++b;
        System.out.println(c);       

        float f = 4.5f; 
        f++;
        //++f;
        System.out.println(f);

        char p =  'R';
        p++;
        System.out.println(p);
    }
}