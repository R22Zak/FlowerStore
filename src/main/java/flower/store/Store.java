/**
* class Store
*/
package flower.store; // no violation
/*
* yea
*/
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    /**
   * Some description here
   */
    @Getter
    private List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
          /**
   * Some description here.
   */
        flowers.add(flower);
    }


    public List<Flower> search(FlowerType flowerType, FlowerColor color
 , Double maxPrice) {
  /**
   * Some description here.
   */
        return flowers.stream()
                .filter(flower -> flower.getFlowerType() 
== flowerType) 
                .filter(flower -> color == null 
|| flower.getColor().equals(color.toString())) 
                .filter(flower -> maxPrice == null 
|| flower.getPrice() <= maxPrice) 
                .collect(Collectors.toList());
    }
}
