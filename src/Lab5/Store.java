package Lab5;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public Product search(String reference) {
        for (Product p : products) {
            if (p.getReference().equals(reference)) return p;
        }
        return null;
    }

    // returns true if found and modified
    public boolean modifyQuantity(String reference, int newQuantity) {
        Product p = search(reference);
        if (p == null) return false;
        p.setQuantity(newQuantity);
        return true;
    }

    public void display() {
        System.out.println("=== Store: " + name + " ===");
        if (products.isEmpty()) {
            System.out.println("No products.");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }
}