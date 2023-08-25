package CompositionChallenge2;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Coffee maker: brewing coffee");
            hasWorkToDo = false;
        }
    }
}
