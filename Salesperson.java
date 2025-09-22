public class Salesperson {
    private String spID;
    private String spName;
    private String spPhone;

    public Salesperson(String spID, String spName, String spPhone) {
        this.spID = spID;
        this.spName = spName;
        this.spPhone = spPhone;
    }

    // Getters
    public String getSpID() {
        return spID;
    }

    public String getSpName() {
        return spName;
    }

    public String getSpPhone() {
        return spPhone;
    }

    // Display
    public void displayInfo() {
        System.out.println("Salesperson: " + spName + " (" + spID + ")");
        System.out.println("Phone: " + spPhone);
    }
}