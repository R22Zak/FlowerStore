package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoreTest {
 
    @Test
    public void testsearch1() {
        Store flowerStore = new Store();
        Flower f1 = new Flower();
        f1.setFlowerType(FlowerType.ROSE);
        f1.setColor(FlowerColor.RED);
        f1.setSepalLength(5.5);
        f1.setPrice(10);
        flowerStore.addFlower(f1);
        Assertions.assertEquals(f1,flowerStore.search(FlowerType.ROSE,FlowerColor.RED,10.0).get(0));
    }

    @Test
    public void testsearch2() {
        Store flowerStore = new Store();
        Flower f2 = new Flower();
        f2.setFlowerType(FlowerType.TULIP);
        f2.setColor(FlowerColor.BLUE);
        f2.setSepalLength(6.0);
        f2.setPrice(8);
        flowerStore.addFlower(f2);
        Assertions.assertEquals(f2,flowerStore.search(FlowerType.TULIP,FlowerColor.BLUE,10.0).get(0));
    }

}
