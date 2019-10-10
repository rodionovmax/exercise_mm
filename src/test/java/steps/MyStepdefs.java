package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataModel;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyStepdefs {

//    public MyStepdefs() {}

    private Map<String, DataModel> valuesList;
    private Map<String, String> values;
    private int amountOfElements;

//    @Given("^Table with Labels and Values$")
//    public void tableWithLabelsAndValues(Map<String, String> values) {
////        List<Map<String, String>> list = table.asMaps(String.class, String.class);
////        return list;
//    this.values = values;
//    }

    @When("^I check all values$")
    public void iCheckAllValues() {
        amountOfElements = values.size() - 1; // because we know that
        System.out.println("There are " + amountOfElements + "values in the table");
    }

    @Then("^Values count is correct$")
    public void valuesCountIsCorrect() {
        int expectedAmountOfElements = 5;
        Assert.assertEquals(amountOfElements, expectedAmountOfElements, "Amount of elements in the file doesn't match with expected");
    }

    @Given("^Table with Labels and Values$")
    public void tableWithLabelsAndValues(List<DataModel> labels) {
        valuesList = new HashMap<>();

        for (DataModel label : labels) {
            String key = label.getLabel();
            valuesList.put(key, label);
        }
    }



}
