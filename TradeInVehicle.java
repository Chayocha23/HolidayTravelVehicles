public class TradeInVehicle {
    private String tradeSerialNo;
    private String tradeModel;
    private int tradeYear;
    private double tradeAllowance;

    public TradeInVehicle(String tradeSerialNo, String tradeModel, int tradeYear, double tradeAllowance) {
        this.tradeSerialNo = tradeSerialNo;
        this.tradeModel = tradeModel;
        this.tradeYear = tradeYear;
        this.tradeAllowance = tradeAllowance;
    }

    public void displayInfo() {
        System.out.println("Trade-in Vehicle: " + tradeModel + " (" + tradeYear + ")");
        System.out.println("Serial No: " + tradeSerialNo);
        System.out.println("Allowance: $" + tradeAllowance);
    }
}
