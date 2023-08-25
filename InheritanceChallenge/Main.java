package InheritanceChallenge;

public class Main {

    public static void main(String[] args) {

        Vehicle vanillaVehicle = new Vehicle();
        // System.out.println(vanillaVehicle);
        // vanillaVehicle.turnLeft();
        // vanillaVehicle.turnRight();
        // vanillaVehicle.turnRight();

        Car boringCar = new Car("Volkswagen", "Jetta", 2000, 4, 48000, "sedan");
        System.out.println(boringCar);
        boringCar.setDirection("South");
        boringCar.turnRight();
        boringCar.turnLeft();
        boringCar.move();
        boringCar.setSpeed(35);
        boringCar.move();
        boringCar.move();

        Ascent myAscent = new Ascent(2019, 41250, "Limited", "white", "beige", true);
        // System.out.println(myAscent);
        // System.out.println(myAscent.getExteriorColor());
        // myAscent.upShift();
        // myAscent.upShift();
        // myAscent.upShift();
        // myAscent.upShift();
        // myAscent.upShift();
        // myAscent.downShift();
        // myAscent.downShift();
        // myAscent.downShift();
        // myAscent.downShift();
        // myAscent.downShift();
        // myAscent.downShift();
        // myAscent.downShift();
    }
}