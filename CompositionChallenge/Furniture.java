package CompositionChallenge;

public class Furniture {

    private String name;
    private String material;
    private int weight;

    public Furniture(String name, String material, int weight) {
        this.name = name;
        this.material = material;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getWeight() {
        return weight;
    }
}
