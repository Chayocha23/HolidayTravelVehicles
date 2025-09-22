public class Customer {
    private String custID;
    private String custName;
    private String custAddress;
    private String custPhone;

    public Customer(String custID, String custName, String custAddress, String custPhone) {
        this.custID = custID;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custPhone = custPhone;
    }

    // Getters
    public String getCustID() {
        return custID;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    // Display
    public void displayInfo() {
        System.out.println("Customer: " + custName + " (" + custID + ")");
        System.out.println("Address: " + custAddress);
        System.out.println("Phone: " + custPhone);
    }
}
