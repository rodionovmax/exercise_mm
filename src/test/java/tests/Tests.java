package tests;

import appmanager.ReaderHelper;
import model.DataModel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    private ReaderHelper reader = new ReaderHelper();

    @Test(priority = 1)
    public void testValuesAmountInFile() {
        int amountOfElements = reader.readFromCSV().size();
        int expectedAmountOfElements = 5;
        Assert.assertEquals(amountOfElements, expectedAmountOfElements, "Amount of elements in the file doesn't match with expected");
    }

    @Test(priority = 2)
    public void testValueGreaterThanZero() {
        List<DataModel> values = reader.readFromCSV();
        for (DataModel value : values) {
            String amount = value.getAmount();
            double amountAsDouble = reader.turnAmountIntoDouble(amount);
            System.out.println(amountAsDouble);
            if (amountAsDouble < 0) {
                Assert.fail("Value is less than Zero");
            }
        }
    }

    @Test(priority = 3)
    public void testTotalBalance() {
        List<DataModel> values = reader.readFromCSV();
        double sum = 0;
        for (DataModel value : values) {
            String amount = value.getAmount();
            double amountAsDouble = reader.turnAmountIntoDouble(amount);
            sum = sum + amountAsDouble;
        }
        System.out.println("Total Balance: " + sum);
        double expectedTotalBudget = 1000000.00;
        Assert.assertEquals(sum, expectedTotalBudget, "Summary of all values ($" + sum + ") doesn't match with expected Total Balance.");
    }

    @Test(priority = 4)
    public void testValuesFormattedAsCurrencies() {
        List<DataModel> values = reader.readFromCSV();
        ArrayList<String> currencies = new ArrayList<>();
        for (DataModel value : values) {
            String amount = value.getAmount();
            currencies.add(amount);
            if (!amount.contains("$") || amount.matches(".*[a-zA-Z].*")) {
                Assert.fail("Value " + value.getAmount() + " is not formatted as currency");
            }
        }
        System.out.println("All values formatted as currencies\n" + currencies);
    }
}

