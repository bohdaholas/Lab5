package flowerstore;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        byte[] color = {127, 5, 2};
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(FlowerType.ROSE);
            flowers[i].setColor(color);
            System.out.println(flowers[i]);
        }
    }
}
