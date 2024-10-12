package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoreTest {
 
    @Test
    public void testSearchRose() {
        Store flowerStore = new Store();
        Flower flowerRose = new Flower();
        double price = 10.0;
        double lenght = 5.5;
        flowerRose.setFlowerType(FlowerType.ROSE);
        flowerRose.setColor(FlowerColor.RED);
        flowerRose.setSepalLength(lenght);
        flowerRose.setPrice(price);
        flowerStore.addFlower(flowerRose);
        Assertions.assertEquals(flowerRose, flowerStore.search(FlowerType.ROSE,
FlowerColor.RED, 10.0).get(0));
    }

    @Test
    public void testSearchTulp() {
        Store flowerStore = new Store();
        Flower flowerTulp = new Flower();
        double price = 8.0;
        double lenght = 6.0;
        flowerTulp.setFlowerType(FlowerType.TULIP);
        flowerTulp.setColor(FlowerColor.BLUE);
        flowerTulp.setSepalLength(lenght);
        flowerTulp.setPrice(price);
        flowerStore.addFlower(flowerTulp);
        Assertions.assertEquals(flowerTulp, flowerStore.search(FlowerType.TULIP,
FlowerColor.BLUE, 10.0).get(0));
    }

}
