/**
* class StoreTest
*/
package flower.store; // no violation
/*
* yea
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoreTest {
      /**
   * Some description here.
   */
    public static final double PRICE = 10.0;
    public static final double LENGHT = 5.5;
    @Test
    public void testSearchRose() {
          /**
   * Some description here.
   */
        Store flowerStore = new Store();
        Flower flowerRose = new Flower();
        flowerRose.setFlowerType(FlowerType.ROSE);
        flowerRose.setColor(FlowerColor.RED);
        flowerRose.setSepalLength(LENGHT);
        flowerRose.setPrice(PRICE);
        flowerStore.addFlower(flowerRose);
        Assertions.assertEquals(flowerRose, flowerStore.search(FlowerType.ROSE,
FlowerColor.RED, PRICE).get(0));
    }

    @Test
    public void testSearchTulp() {
          /**
   * Some description here.
   */
        Store flowerStore = new Store();
        Flower flowerTulp = new Flower();
        flowerTulp.setFlowerType(FlowerType.TULIP);
        flowerTulp.setColor(FlowerColor.BLUE);
        flowerTulp.setSepalLength(LENGHT);
        flowerTulp.setPrice(PRICE);
        flowerStore.addFlower(flowerTulp);
        Assertions.assertEquals(flowerTulp, flowerStore.search(FlowerType.TULIP,
FlowerColor.BLUE, PRICE).get(0));
    }

}
