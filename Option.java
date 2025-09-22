public class Option {
    private String optCode;
    private String optDesc;
    private double optPrice;

    public Option(String optCode, String optDesc, double optPrice) {
        this.optCode = optCode;
        this.optDesc = optDesc;
        this.optPrice = optPrice;
    }

    public void displayInfo() {
        System.out.println("Option: " + optDesc + " (Code: " + optCode + ")");
        System.out.println("Price: $" + optPrice);
    }
}