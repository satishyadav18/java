class Car{
    public void start(){
        System.out.println("Car is starting");
    }
    public void accelerate(){
        System.out.println("Car is accelerating");
    }
    public void changeGear(){
        System.out.println("Car is changing gear");
    }
}

class luxuryCar extends Car{
    @Override
    public void changeGear(){
        System.out.println("Luxury car is changing gear with automatic transmission");
    }

    public void playMusic(){
        System.out.println("Luxury car is playing music");
    }
}



public class OverridingCar{
    public static void main(String[] args){
        Car car = new Car(); //super class object 
        car.start(); //super class method o/p= car is starting
        car.accelerate();   //super class method o/p= car is accelerating
        car.changeGear();     //super class method o/p= car is changing gear 

        luxuryCar lcar = new luxuryCar();
        lcar.start(); //super class method o/p= car is starting
        lcar.accelerate(); //super class method o/p= car is accelerating
        lcar.changeGear();  //sub class method o/p= luxury car is changing gear with automatic transmission
        lcar.playMusic(); //sub class method o/p= luxury car is playing music

        Car c = new luxuryCar(); //Dynamic method dispatch
                                 // reference of super class and object of sub class     
        c.start();       //super class method o/p= car is starting   
        c.accelerate(); //super class method o/p= car is accelerating
        c.changeGear(); //sub class method o/p= luxury car is changing gear with automatic transmission
       // c.playMusic(); //Error
    }
}