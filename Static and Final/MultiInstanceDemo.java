class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;

    private static final int MAX_INSTANCES = 3;
    private static int count = 0;
    private static CoffeeMachine[] instances = new CoffeeMachine[MAX_INSTANCES];

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugarQty = 1;
    }

    public void fillCoffee(float qty) { coffeeQty = qty; }
    public void fillWater(float qty) { waterQty = qty; }
    public void fillMilk(float qty) { milkQty = qty; }
    public void fillSugar(float qty) { sugarQty = qty; }
    public float getCoffeeQty() { return coffeeQty; }

    public static CoffeeMachine getInstance() {
        if (count < MAX_INSTANCES) {
            CoffeeMachine cm = new CoffeeMachine();
            instances[count] = cm;
            count++;
            return cm;
        } else {
            // return null or throw exception
            // throw new RuntimeException("Max instances reached");
            return null;
        }
    }
}

public class MultiInstanceDemo {
    public static void main(String[] args) {
        CoffeeMachine cm1 = CoffeeMachine.getInstance();
        CoffeeMachine cm2 = CoffeeMachine.getInstance();
        CoffeeMachine cm3 = CoffeeMachine.getInstance();
        CoffeeMachine cm4 = CoffeeMachine.getInstance(); // will be null

        System.out.println(cm1);
        System.out.println(cm2);
        System.out.println(cm3);
        System.out.println(cm4); // null
    }
}
