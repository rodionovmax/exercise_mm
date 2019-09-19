package appmanager;

import model.DataModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReaderHelper {

    private static final int LABEL_ID = 0;
    private static final int AMOUNT_ID = 1;

    public List<DataModel> readFromCSV() {
        List<DataModel> values = new ArrayList<>();
        Path pathToFile = Paths.get("src/main/resources/values.csv");

        try (BufferedReader fileReader = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = fileReader.readLine();

            while (line != null) {
                String[] attributes = line.split(";");
                DataModel value = new DataModel(attributes[LABEL_ID], attributes[AMOUNT_ID]);
                values.add(value);
                line = fileReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return values;
    }

    public double turnAmountIntoDouble(String amount) {
        String amountAsDigit = amount.replace("$","").replace(",", "");
        return Double.parseDouble(amountAsDigit);
    }
}
