import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestForCartClass extends BeforeAfter {

    @Test
    void scenarioGetCartName() {
        assertEquals("new-cart", newCart.getCartName());
    }
}
