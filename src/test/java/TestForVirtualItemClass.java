import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.VirtualItem;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Disabled
public class TestForVirtualItemClass {
    Cart lenaCart = null;
    VirtualItem game = null;

    @BeforeEach
    public void createNewCartAndItems() {
        lenaCart = new Cart("lena-cart");
        game = new VirtualItem();
    }

    @Test
    void scenarioForToString() {
        game.setName("Game Of Thrones");
        game.setPrice(1.5);
        game.setSizeOnDisk(2500);
        assertEquals("Class: class shop.VirtualItem; Name: Game Of Thrones; Price: 1.5; Size on disk: 2500.0", game.toString());
    }
}