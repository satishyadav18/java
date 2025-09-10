class Outer{
   static  int x = 10; // static variables can also be used here 
    Inner i = new Inner(); // instance of inner class can be created here and is accessible in outer class methods

    class Inner{
        int y = 20;

        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay(){
        //Inner i = new Inner();
        i.innerDisplay();
        //System.out.println(x);
        System.err.println(i.y);
    }
}

public class NestedInner{
    public static void main(String[] args){
        // Outer o = new Outer();
        // // o.outerDisplay();
        // Outer.Inner in = o.new Inner();

        Outer.Inner in = new Outer().new Inner(); // creating instance of inner class without creating instance of outer class
        in.innerDisplay();
    }
}