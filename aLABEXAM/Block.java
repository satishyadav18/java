class Demo{
    Demo(){
        System.out.println("Inside Demo constructor");
    }
    {
        System.out.println("Inside non static block 1");
    }
    {
        System.out.println("Inside non static block 2");
    }
}

class Tutorial extends Demo{
    Tutorial(){
        System.out.println("Inside Tutorial constructor");
    }
    {
        System.out.println("Inside non static block 3");
    }
}

public class Block{
    public static void main(String[] args){
       Tutorial t = new Tutorial();
    }
}