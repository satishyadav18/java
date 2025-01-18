class Demo{
    public void display(){
        System.out.println("Hello");
    }
}

interface Interf{
    void greet();
}

public class Test_t{
    public static void main(String[] args){
       Demo d1 = new Demo(){
        public void display(){
            System.out.println("Konichiwa");
        }
       };
       d1.display();

       Interf i = new Interf(){
        public void greet(){
            System.out.println("Namaste");
        }
       };
       i.greet();

       Demo d3 = new Demo();
       d3.display();
    }
}