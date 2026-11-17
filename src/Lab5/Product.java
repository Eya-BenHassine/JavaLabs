package Lab5;

public abstract class Product {
    private String reference;
    private String name;
    private double price;     // excluding tax
    private int quantity;
    private String description;

    public Product(String reference, String name, double price, int quantity) {
        this(reference, name, price, quantity, "No description");
    }

    public Product(String reference, String name, double price, int quantity, String description) {
        this.reference = reference;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // price including tax
    public abstract double priceTTC();

    @Override
    public String toString() {
        return "Ref: " + reference + " | Name: " + name + " | Price HT: " + price
                + " | Price TTC: " + priceTTC() + " | Qty: " + quantity
                + " | Desc: " + description;
    }
}