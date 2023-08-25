package CompositionChallenge;

public class Main {

    public static void main(String[] args) {

        Furniture myBed = new Furniture("bed", "foam", 80);
        Furniture myDresser = new Furniture("dresser", "wood", 110);
        Furniture myNightstand = new Furniture("nightstand", "wood", 50);

        Furniture[] myFurniture = { myBed, myDresser, myNightstand };

        Room myRoom = new Room("bedroom", myFurniture, new Dimensions(12, 18), 2, 5);
        myRoom.describe();
    }
}
