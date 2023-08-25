package InheritanceChallenge;

public class Ascent extends Car {

    private String trimLevel;
    private String exteriorColor;
    private String interiorColor;
    private boolean hasSunRoof;

    //constructors

    public Ascent() {
        this("Subaru", "Ascent", 2022, 0, 0, "North", 1, 4, 0, "SUV", 1, "base", "Crystal White Pearl", "Slate Black", false);
    }

    public Ascent(int year, int mileage, String trimLevel, String exteriorColor, String interiorColor, boolean hasSunRoof) {
        this("Subaru", "Ascent", year, 0, 0, "North", 1, 4, mileage, "SUV", 1, trimLevel, exteriorColor, interiorColor, hasSunRoof);
    }

    public Ascent (String make, String model, int year, int position, int speed, String direction, int passengers, int wheels, int mileage, String bodyStyle, int gear, String trimLevel, String exteriorColor, String interiorColor, boolean hasSunRoof) {
        super(make, model, year, position, speed, direction, passengers, wheels, mileage, bodyStyle, gear);
        this.trimLevel = trimLevel;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.hasSunRoof = hasSunRoof;
    }

    //getters

    public String getTrimLevel() {
        return this.trimLevel;
    }

    public String getExteriorColor() {
        return this.exteriorColor;
    }

    public String getInteriorColor() {
        return this.interiorColor;
    }

    public boolean getHasSunRoof() {
        return this.hasSunRoof;
    }

    //setters

    public void setTrimLevel(String trimLevel) {
        this.trimLevel = trimLevel;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }
}