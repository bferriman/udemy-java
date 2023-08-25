package CompositionChallenge2;

public class Main {

    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker(false);
        DishWasher myDishWasher = new DishWasher(false);
        Refrigerator myRefrigerator = new Refrigerator(false);

        SmartKitchen mySmartKitchen = new SmartKitchen(myRefrigerator, myDishWasher, myCoffeeMaker);

        mySmartKitchen.addWater();
        mySmartKitchen.loadDishwasher();
        mySmartKitchen.pourMilk();

        mySmartKitchen.doKitchenWork();
    }
}
