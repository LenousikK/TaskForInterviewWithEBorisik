import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class TestForVirtualItemClass extends BeforeAfter {

    @Test
    void scenarioSetSizeOnDisk() {
        disk.setSizeOnDisk(10000);
        assertEquals(10000, disk.getSizeOnDisk());
    }
}
