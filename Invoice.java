public class Invoice {
    private String invID;
    private String invDate;
    private double totalAmount;
    private double taxAmount;
    private double feeLicense;
    private String authSignature;

    public Invoice(String invID, String invDate, double totalAmount, double taxAmount, double feeLicense, String authSignature) {
        this.invID = invID;
        this.invDate = invDate;
        this.totalAmount = totalAmount;
        this.taxAmount = taxAmount;
        this.feeLicense = feeLicense;
        this.authSignature = authSignature;
    }

    public void displayInfo() {
        System.out.println("Invoice ID: " + invID);
        System.out.println("Date: " + invDate);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("License Fee: $" + feeLicense);
        System.out.println("Authorized by: " + authSignature);
    }
}
