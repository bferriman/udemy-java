package InheritanceChallenge;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private int position;
    private int speed;
    private String direction;
    private int passengers;
    
    //constructors

    public Vehicle() {
        this("unknown", "unknown", 1, 0, 0, "North", 1);
    }

    public Vehicle(String make, String model, int year) {
        this(make, model, year, 0, 0, "North", 1);
    }

    public Vehicle(String make, String model, int year, int position, int speed, String direction, int passengers) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.position = position;
        this.speed = speed;
        this.direction = direction;
        this.passengers = passengers;
    }

    // getters

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public int getPosition() {
        return this.position;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getDirection() {
        return this.direction;
    }

    public int getPassengers() {
        return this.passengers;
    }

    //setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    //methods

    public void move() {
        System.out.println("Moving from position " + this.position + "...");
        this.setPosition(this.position + this.speed);
        System.out.println("...to position " + this.position);
    }

    public void turnLeft() {
        System.out.println("Travelling " + this.direction + ", you turn left...");
        switch(this.direction) {
            case "North":
                this.setDirection("West");
                break;

            case "East":
                this.setDirection("North");
                break;

            case "South":
                this.setDirection("East");
                break;

            case "West":
                this.setDirection("South");
                break;

            default:
                System.out.println("Unexpected value for current direction - No turn made");
        }
        System.out.println("...and are now heading " + this.direction);
    }

    public void turnRight() {
        System.out.println("Travelling " + this.direction + ", you turn right...");
        switch(this.direction) {
            case "North":
                this.setDirection("East");
                break;

            case "East":
                this.setDirection("South");
                break;

            case "South":
                this.setDirection("West");
                break;

            case "West":
                this.setDirection("North");
                break;

            default:
                System.out.println("Unexpected value for current direction - No turn made");
        }
        System.out.println("...and are now heading " + this.direction);
    }
}