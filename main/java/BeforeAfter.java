import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import shop.Cart;
import parser.JsonParser;
import shop.RealItem;
import shop.VirtualItem;

import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;

public class BeforeAfter {
    Cart newCart = null;
    JsonParser parser = null;
    RealItem car = null;
    VirtualItem disk = null;

    @BeforeEach
    public Cart createCart() {
        newCart = new Cart("new-cart");
        System.out.println(newCart.toString() + " Cart is created");
        return newCart;
    }

    @BeforeEach
    public JsonParser createJsonParser() {
        parser = new JsonParser();
        System.out.println(parser.toString() + " is created");
        return parser;
    }

    @BeforeEach
    public RealItem createRealItemCar() {
        car = new RealItem();
        System.out.println(car.toString() + " is created");
        return car;
    }

    @BeforeEach
    public VirtualItem createVirtualItemDisk() {
        disk = new VirtualItem();
        System.out.println(disk.toString() + " is created");
        return disk;
    }

    @AfterEach
    public void removeAllFilesCreatedInTests() {
        System.out.println("All Files created by Test is going to be removed");
        File folder = new File("src/main/resources/");
        File[] arrayListOfFiles = folder.listFiles();
        ArrayList<File> arrayListListOfFiles = new ArrayList<File>(Arrays.asList(arrayListOfFiles));

        for (int i = 0; i < arrayListListOfFiles.size(); i++) {
            if (arrayListListOfFiles.get(i).isFile()) {
                if (!(arrayListListOfFiles.get(i).getName().equals("andrew-cart.json") || arrayListListOfFiles.get(i).getName().equals("eugen-cart.json"))) {
                    System.out.println("File " + arrayListListOfFiles.get(i).getName() + " needs to be removed");
                    String fileName = arrayListListOfFiles.get(i).getName();
                    File file = new File("src/main/resources/" + fileName);
                    file.delete();
                    System.out.println(fileName + " is removed");
                } else {
                    System.out.println(arrayListListOfFiles.get(i).getName() + " existed before Test and should be kept");
                }

            }
        }
    }
}
