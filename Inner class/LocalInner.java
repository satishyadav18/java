// abstract class My{
//     abstract public void show();
// }

interface My{
    public void show();
}

class Outer{
    public void display(){
        // class Inner{
        //     public void show(){
        //         System.out.println("hello from inner class");
        //     }
        // }

        // // Inner i = new Inner();
        // // i.show();

        // new Inner().show(); // Anonymous object of inner class


        //works for abstract and interface also
        // My m = new My(){
        //     @Override
        //     public void show(){
        //         System.out.println("Abstract hello from inner class");
        //     }
        // };
        // m.show();  // Object of abstract class

        //works for abstract and interface also
        new My(){
            @Override
            public void show(){
                System.out.println("Anonymous hello from inner class");
            }
        }.show();  // Anonymous object of abstract class
    
    }

      

}


public class LocalInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}