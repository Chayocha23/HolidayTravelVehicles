public class Dealer {
    private String dealerID;
    private String dealerName;
    private String dealerAddress;
    private String dealerPhone;

    public Dealer(String dealerID, String dealerName, String dealerAddress, String dealerPhone) {
        this.dealerID = dealerID;
        this.dealerName = dealerName;
        this.dealerAddress = dealerAddress;
        this.dealerPhone = dealerPhone;
    }

    public void displayInfo() {
        System.out.println("Dealer: " + dealerName + " (" + dealerID + ")");
        System.out.println("Address: " + dealerAddress);
        System.out.println("Phone: " + dealerPhone);
    }
}