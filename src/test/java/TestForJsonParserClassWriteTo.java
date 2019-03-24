import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parser.JsonParser;
import shop.Cart;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForJsonParserClassWriteTo {
    JsonParser parser = null;
    Cart lenaCart = null;

    @BeforeEach
    public void createJsonParser() {
        parser = new JsonParser();
        lenaCart = new Cart("lena-cart");
    }

    @Test
    public void scenarioWriteToValidData() {
        parser.writeToFile(lenaCart);
        File folder = new File("src/main/resources/");
        File[] arrayOfFilesInResourcesFolder = folder.listFiles();
        ArrayList<File> arrayListOfFilesInResourcesFolder = new ArrayList<File>(Arrays.asList(arrayOfFilesInResourcesFolder));
        boolean isFileEqualToCartName = false;
        for (int i = 0; i < arrayListOfFilesInResourcesFolder.size(); i++) {
            if (arrayListOfFilesInResourcesFolder.get(i).isFile()) {
                if (arrayListOfFilesInResourcesFolder.get(i).getName().equals("lena-cart.json")) {
                    isFileEqualToCartName = true;
                    break;
                }
            }
        }
        assertTrue(isFileEqualToCartName);
    }

    @AfterEach
    public void removeAllFilesCreatedInTests() {
        File folder = new File("src/main/resources/");
        File[] arrayListOfFiles = folder.listFiles();
        if (arrayListOfFiles != null) {
            Stream.of(arrayListOfFiles)
                    .filter(file -> !file.getName().contains("andrew-cart.json") && !file.getName().contains("eugen-cart.json"))
                    .forEach(f -> new File(f.getAbsolutePath()).delete());
        }
    }
}

