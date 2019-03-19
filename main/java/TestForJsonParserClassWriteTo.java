import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForJsonParserClassWriteTo extends BeforeAfter {

    @Test
    public void scenarioWriteToValidData() {
        parser.writeToFile(createCart());

        File folder = new File("src/main/resources/");
        File[] arrayOfFilesInResourcesFolder = folder.listFiles();
        ArrayList<File> arrayListOfFilesInResourcesFolder = new ArrayList<File>(Arrays.asList(arrayOfFilesInResourcesFolder));

        for (int i = 0; i < arrayListOfFilesInResourcesFolder.size(); i++) {
            if (arrayListOfFilesInResourcesFolder.get(i).isFile()) {
                if (arrayListOfFilesInResourcesFolder.get(i).getName().equals("new cart.json")) {
                    assertTrue(true);
                }
            }

        }
    }
}

