class Test{
    static int a=10;
    int b=20;

    void display(){
        System.out.println(a+" "+b);
    }
    static void show(){
        System.out.println(a);
        //System.out.println(b); //error
    }   
}

public class StaticPractice {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.display();
        Test.a=15; //static variable can be changed using class name and also using object reference
        t1.b=25; //instance variable can be changed using object reference
        //t1.display();
        Test.show();

        Test t2=new Test();
       // t2.b=30;  //independent for each object
        t2.display();
    }
}