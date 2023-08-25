package InheritanceChallenge;

public class Car extends Vehicle {

    private int wheels;
    private int mileage;
    private String bodyStyle;
    private int gear;

    //constructors

    public Car() {
        super();
        this.wheels = 4;
        this.mileage = 0;
        this.bodyStyle = "crossover";
        this.gear = 1;
    }

    public Car(String make, String model, int year, int wheels, int mileage, String bodyStyle) {
        super(make, model, year);
        this.wheels = wheels;
        this.mileage = mileage;
        this.bodyStyle = bodyStyle;
        this.gear = 1;
    }

    public Car(String make, String model, int year, int position, int speed, String direction, int passengers, int wheels, int mileage, String bodyStyle, int gear) {
        super(make, model, year, position, speed, direction, passengers);
        this.wheels = wheels;
        this.mileage = mileage;
        this.bodyStyle = bodyStyle;
        this.gear = gear;
    }

    //getters

    public int getWheels() {
        return this.wheels;
    }

    public int getMileage() {
        return this.mileage;
    }

    public String getBodyStyle() {
        return this.bodyStyle;
    }

    public int getGear() {
        return this.gear;
    }

    //setters

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    //methods

    public void upShift() {
        if (this.gear < 5) {
            this.gear++;
            System.out.println("Shifted into gear " + this.gear);
        } else {
            System.out.println("Already in top gear!");
        }
    }

    public void downShift() {
        if (this.gear > -1) {
            this.gear--;
            System.out.println("Shifted into gear " + this.gear);
        } else {
            System.out.println("Already in lowest gear!");
        }
    }

}