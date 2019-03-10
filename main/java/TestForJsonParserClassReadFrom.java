import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import parser.NoSuchFileException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestForJsonParserClassReadFrom extends BeforeAfter {

    @ParameterizedTest
    @ValueSource(strings = { "abc1", "abc2", "abc3", "abc4", "abc5" })
    public void scenarioReadFromInvalidData(String resourcesFolderPath) {

        File fileToRead = new File("src/main/resources/" + resourcesFolderPath);

        Exception exception = assertThrows(NoSuchFileException.class, () ->
                parser.readFromFile(fileToRead));
        System.out.println(exception.getMessage());
        assertEquals(String.format("File src\\main\\resources\\%s.json not found!", resourcesFolderPath), exception.getMessage());
    }


}
