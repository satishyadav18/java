class TV{
    public void switchOn(){
        System.out.println("TV is switched on");
    }
    public void changeChannel(){
        System.out.println("Channel is changed");
    }
}

class SmartTV extends TV{
    @Override
    public void switchOn(){
        System.out.println("Smart TV is switched on");
    }

    @Override
    public void changeChannel(){
        System.out.println("Channel is changed in Smart TV");
    }

    public void browse(){
        System.out.println("Smart TV Browsing");
    }
}


public class OverridingTV{
    public static void main(String[] args){
        // TV tv = new TV();
        // tv.switchOn();
        // tv.changeChannel(); 

        SmartTV stv = new SmartTV();
        stv.switchOn();
        stv.changeChannel();
        stv.browse();

        TV tv = new SmartTV(); //Dynamic method dispatch
        tv.switchOn();          // reference of super class and object of sub class
        tv.changeChannel();
        //gittv.browse(); //Error  
    }
}