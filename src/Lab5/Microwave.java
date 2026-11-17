package Lab5;

public class Microwave extends Product {
    public static final double VAT = 0.10;
    private String brand;
    private double trayDiameter;
    private double capacity;
    private int power;

    public Microwave(String reference, String name, double price, int quantity, String description,
                     String brand, double trayDiameter, double capacity, int power) {
        super(reference, name, price, quantity, description);
        this.brand = brand;
        this.trayDiameter = trayDiameter;
        this.capacity = capacity;
        this.power = power;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public double getTrayDiameter() { return trayDiameter; }
    public void setTrayDiameter(double trayDiameter) { this.trayDiameter = trayDiameter; }
    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }
    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    @Override
    public double priceTTC() {
        return getPrice() * (1 + VAT);
    }

    @Override
    public String toString() {
        return "[Microwave] " + super.toString() + " | Brand: " + brand + " | Tray: " + trayDiameter
                + "cm | Capacity: " + capacity + "L | Power: " + power + "W";
    }
}