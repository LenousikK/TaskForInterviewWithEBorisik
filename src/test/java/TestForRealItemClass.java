import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestForRealItemClass {
    Cart lenaCart = null;
    RealItem dog = null;

    @BeforeEach
    public void createNewCartAndItems() {
        lenaCart = new Cart("lena-cart");
        dog = new RealItem();
    }

    @Test
    void scenarioForToString() {
        dog.setName("Max");
        dog.setPrice(850);
        dog.setWeight(8);
        lenaCart.addRealItem(dog);
        assertEquals("Class: class shop.RealItem; Name: Max; Price: 850.0; Weight: 8.0", dog.toString());
    }
}