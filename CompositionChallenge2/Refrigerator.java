package CompositionChallenge2;

public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Refrigerator: ordering food");
            hasWorkToDo = false;
        }
    }
}
