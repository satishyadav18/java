class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;

    static private CoffeeMachine instance = null;

    private CoffeeMachine(){
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugarQty = 1;
    }

    public void fillCoffee(float qty){
        coffeeQty = qty;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }

    public void fillMilk(float qty){
        milkQty = qty;
    }

    public void fillSugar(float qty){
        sugarQty = qty;
    }

    public float getCoffeQty(){
        return 0.23f;
    }    

    static CoffeeMachine getInstance(){
        if(instance == null){
            instance = new CoffeeMachine();
        }
        return instance;
    }

}

public class SingletonClass{
    public static void main(String[] args) {
        CoffeeMachine cm1 = CoffeeMachine.getInstance();
        CoffeeMachine cm2 = CoffeeMachine.getInstance();
        CoffeeMachine cm3 = CoffeeMachine.getInstance();

        System.out.println(cm1+" "+cm2+" "+cm3);

        if(cm1 == cm2 && cm2 == cm3){
            System.out.println("Same Instance");
        }else{
            System.out.println("Different Instance");
        }
    }
}