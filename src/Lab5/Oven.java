package Lab5;

public class Oven extends Product {
    public static final double VAT = 0.05;
    private String brand;
    private int power;
    private int grillPower;
    private int maxTemp;
    private int minTemp;

    public Oven(String reference, String name, double price, int quantity, String description,
                String brand, int power, int grillPower, int maxTemp, int minTemp) {
        super(reference, name, price, quantity, description);
        this.brand = brand;
        this.power = power;
        this.grillPower = grillPower;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }
    public int getGrillPower() { return grillPower; }
    public void setGrillPower(int grillPower) { this.grillPower = grillPower; }
    public int getMaxTemp() { return maxTemp; }
    public void setMaxTemp(int maxTemp) { this.maxTemp = maxTemp; }
    public int getMinTemp() { return minTemp; }
    public void setMinTemp(int minTemp) { this.minTemp = minTemp; }

    @Override
    public double priceTTC() {
        return getPrice() * (1 + VAT);
    }

    @Override
    public String toString() {
        return "[Oven] " + super.toString() + " | Brand: " + brand + " | Power: " + power
                + "W | Grill: " + grillPower + "W | Temp: " + minTemp + "-" + maxTemp;
    }
}