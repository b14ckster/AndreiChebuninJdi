package hw1.dataProviders;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import hw1.entities.MetalColorsEntity;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import org.testng.annotations.DataProvider;

public class FromJsonDataProvider {

    private static final String PATH_TO_JSON_DATA_FILE =
        "src/test/resources/hw1/JDI_ex8_metalsColorsDataSet.json";

    @DataProvider
    public static Iterator<Object[]> getMetalColorsEntities() {
        return JsonParser
            .parseReader(jsonReader(PATH_TO_JSON_DATA_FILE))
            .getAsJsonObject()
            .entrySet()
            .stream()
            .map(el -> el.getValue())
            .map(jsonElement -> new Gson().fromJson(jsonElement, MetalColorsEntity.class))
            .map(el -> new Object[] {el})
            .iterator();
    }

    private static JsonReader jsonReader(String jsonPath) {
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader(jsonPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reader;
    }
}
