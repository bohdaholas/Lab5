package flowerstore;

public class FlowerPack {
    private Flower flower;
    private int flowerNum;

    public double getPrice() {
        return flower.getPrice() * flowerNum;
    }
}
