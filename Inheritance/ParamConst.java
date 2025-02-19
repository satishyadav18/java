class Parent{
    Parent(){
        System.out.println("Non-Param of parent");
    }
    Parent(int x){
        System.out.println("Param of parent "+x);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Non-Param of child");
    }
    Child(int y){
        System.out.println("Param of child "+y);
    }
     Child(int x, int y){
        
        super(x);   // it is a keyword that refers to super class and when a parameter
                    // is passed it means that super or parent class constructor is called.
        System.out.println("2nd Param of  child "+y);
    }
}

public class ParamConst{
    public static void main(String[] args){

        Child c = new Child(); //Non-Param of parent
                                //Non-Param of child

        Child d = new Child(18); //Non-Param of parent
                                // Param of child 18

        Child e = new Child(14, 25); //Param of parent 14
                                     //2nd Param of  child 25
    }
}