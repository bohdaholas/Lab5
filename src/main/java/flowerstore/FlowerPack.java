package flowerstore;

public class FlowerPack {
    private Flower flower;
    private int amount;

    public double price() {
        return flower.getPrice() * amount;
    }
}
