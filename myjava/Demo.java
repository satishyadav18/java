package myjava;

class Computer{
    public void playMusic(){
        System.out.println("Playing Music....");
    }

    public String getMePen(int cost){
        if(cost >= 10)
            return "you got a Pen";
        return "Nothing...";
    }
}


public class Demo {
    public static void main(String[] args){
        Computer obj  = new Computer();
        obj.playMusic();
        String str = obj.getMePen(15);
        System.out.println(str);
    }
}
