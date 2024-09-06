
public class Array {
    public static void main(Str[] args){
        int num[] = {3,5,8};
        System.out.println(num[2]);

        int p[] = new int[4];
        p[0] = 1;
        p[1] = 3;
        p[2] = 4;
        p[3] = 9;
        for(int i=0; i<4; i++){
            System.out.println(p[i]);
        }
//special for loop>>>>>>>
        for(int n : p){
            System.out.println(n);
        }
        
    }
}
