package CompositionChallenge;

public class Room {

    private String function;
    private Furniture[] furniture;
    private Dimensions dimensions;
    private int numWindows;
    private int numDoors;

    public Room(String function, Furniture[] furniture, Dimensions dimensions, int numWindows, int numDoors) {
        this.function = function;
        this.furniture = furniture;
        this.dimensions = dimensions;
        this.numWindows = numWindows;
        this.numDoors = numDoors;
    }

    public void describe() {
        System.out.println("The room is a " + function + ".");
        System.out.println("The room is " + dimensions.getWidth() + " ft wide by " + dimensions.getLength() + " ft long.");
        System.out.println("The room has " + numWindows + " windows and " + numDoors + " doors.");
        System.out.println("The room contains the following furniture:");
        for(int i = 0; i < furniture.length; i++) {
            System.out.println(furniture[i].getName());
        }
    }

    public void vacuum() {
        System.out.println("vrooooooooooooooooom");
    }
}
