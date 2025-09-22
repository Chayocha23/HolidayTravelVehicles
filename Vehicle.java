public class Vehicle {
    private String vehSerialNo;
    private String vehName;
    private String vehModel;
    private int vehYear;
    private double vehBaseCost;
    private String vemanufacturer;

    public Vehicle(String vehSerialNo, String vehName, String vehModel, int vehYear, double vehBaseCost,
            String vemanufacturer) {
        this.vehSerialNo = vehSerialNo;
        this.vehName = vehName;
        this.vehModel = vehModel;
        this.vehYear = vehYear;
        this.vehBaseCost = vehBaseCost;
        this.vemanufacturer = vemanufacturer;
    }

    // Getters
    public String getVehSerialNo() {
        return vehSerialNo;
    }

    public String getVehName() {
        return vehName;
    }

    public String getVehModel() {
        return vehModel;
    }

    public int getVehYear() {
        return vehYear;
    }

    public double getVehBaseCost() {
        return vehBaseCost;
    }

    public String getVemanufacturer() {
        return vemanufacturer;
    }

    public void displayInfo() {
        System.out.println("Vehicle: " + vehName + " (" + vehModel + ")");
        System.out.println("Year: " + vehYear);
        System.out.println("Serial No: " + vehSerialNo);
        System.out.println("Base Cost: $" + vehBaseCost);
        System.out.println("Manufacturer: " + vemanufacturer);
    }
}
