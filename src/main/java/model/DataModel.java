package model;

public class DataModel {

    private String label;
    private String amount;

    public DataModel(String label, String amount) {
        this.label = label;
        this.amount = amount;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "label='" + label + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
