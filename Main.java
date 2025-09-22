public class Main {
    public static void main(String[] args) {
        // Create Manufacturer
        Manufacturer manu1 = new Manufacturer("Toyota", "Bangkok, Thailand", "02-123-4567");
        Manufacturer manu2 = new Manufacturer("Honda", "Chiang Mai, Thailand", "053-999-888");

        // Create Vehicles
        Vehicle v1 = new Vehicle("VH001", "Corolla", "Altis", 2024, 750000, "Toyota");
        Vehicle v2 = new Vehicle("VH002", "Civic", "Turbo", 2023, 820000, "Honda");

        // Create Trade-in Vehicle
        TradeInVehicle t1 = new TradeInVehicle("TR001", "Mazda 2", 2018, 250000);

        // Create Options
        Option opt1 = new Option("OP01", "Leather Seats", 25000);
        Option opt2 = new Option("OP02", "GPS Navigation", 15000);

        // Create Customer
        Customer cust1 = new Customer("C001", "John Smith", "123 Sukhumvit Rd, Bangkok", "089-123-4567");

        // Create Salesperson
        Salesperson sp1 = new Salesperson("SP001", "Alice Johnson", "081-222-3333");

        // Create Invoice
        Invoice inv1 = new Invoice("INV001", "2025-09-22", 820000, 50000, 2000, "Alice Johnson");

        // Create Dealer
        Dealer dealer1 = new Dealer("D001", "Holiday Travel Vehicles Co., Ltd.", "Bangkok, Thailand", "02-777-9999");

        // Display all information
        System.out.println("===== DEALER INFORMATION =====");
        dealer1.displayInfo();

        System.out.println("\n===== CUSTOMER INFORMATION =====");
        cust1.displayInfo();

        System.out.println("\n===== SALESPERSON INFORMATION =====");
        sp1.displayInfo();

        System.out.println("\n===== VEHICLES AVAILABLE =====");
        v1.displayInfo();
        System.out.println();
        v2.displayInfo();

        System.out.println("\n===== TRADE-IN VEHICLE =====");
        t1.displayInfo();

        System.out.println("\n===== SELECTED OPTIONS =====");
        opt1.displayInfo();
        System.out.println();
        opt2.displayInfo();

        System.out.println("\n===== INVOICE =====");
        inv1.displayInfo();

        System.out.println("\n===== MANUFACTURERS =====");
        manu1.displayInfo();
        System.out.println();
        manu2.displayInfo();
    }
}
