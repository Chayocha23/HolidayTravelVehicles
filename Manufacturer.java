public class Manufacturer {
    private String name;
    private String address;
    private String phone;

    public Manufacturer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}
