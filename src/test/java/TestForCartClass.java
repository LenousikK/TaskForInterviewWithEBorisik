import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;
import shop.VirtualItem;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForCartClass {
    Cart lenaCart = null;
    RealItem dress = null;
    VirtualItem game = null;

    @BeforeEach
    public void createNewCartAndItems() {
        lenaCart = new Cart("lena-cart");
        dress = new RealItem();
        game = new VirtualItem();
    }

    @Test
    void scenarioGetTotalPriceForAllItemsInCart() {
        dress.setPrice(50.5);
        lenaCart.addRealItem(dress);
        game.setPrice(1.5);
        lenaCart.addVirtualItem(game);
        assertEquals(62.4, lenaCart.getTotalPrice());
    }
}