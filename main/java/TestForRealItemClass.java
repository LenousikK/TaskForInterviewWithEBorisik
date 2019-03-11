import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestForRealItemClass extends BeforeAfter {

    @Test
        void scenarioSetRealItemWeightAndPrice() {

        car.setWeight(1700);
        car.setPrice(45000);
        assertAll("realItem",
                () -> assertEquals(1700, car.getWeight()),
                () -> assertEquals(45000, car.getPrice())
        );

    }
}
