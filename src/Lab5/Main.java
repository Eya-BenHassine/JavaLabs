package Lab5;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static String readText(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    static int readInt(String msg) {
        return Integer.parseInt(readText(msg));
    }

    static double readDouble(String msg) {
        return Double.parseDouble(readText(msg));
    }

    static Product createProduct() {
        int type = readInt("Type (1 = Oven, 2 = Microwave): ");
        String ref = readText("Reference: ");
        String name = readText("Name: ");
        double price = readDouble("Price (excl. tax): ");
        int qty = readInt("Quantity: ");
        String desc = readText("Description (Enter to skip): ");
        if (desc.isEmpty()) desc = "No description";
        String brand = readText("Brand: ");

        if (type == 1) {
            int power = readInt("Power (W): ");
            int grill = readInt("Grill power (W): ");
            int max = readInt("Max temperature: ");
            int min = readInt("Min temperature: ");
            return new Oven(ref, name, price, qty, desc, brand, power, grill, max, min);
        } else {
            double tray = readDouble("Tray diameter (cm): ");
            double cap = readDouble("Capacity (L): ");
            int power = readInt("Power (W): ");
            return new Microwave(ref, name, price, qty, desc, brand, tray, cap, power);
        }
    }

    public static void main(String[] args) {
        Store store = null;
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Create a store");
            System.out.println("2. Add a product");
            System.out.println("3. Modify the quantity of a product");
            System.out.println("4. Display the list of products");
            System.out.println("5. Search for a product by reference");
            System.out.println("6. Exit");
            choice = readInt("Choice: ");

            if (choice >= 2 && choice <= 5 && store == null) {
                System.out.println("Create a store first (option 1).");
                continue;
            }

            switch (choice) {
                case 1:
                    store = new Store(readText("Store name: "));
                    System.out.println("Store created.");
                    break;
                case 2:
                    store.addProduct(createProduct());
                    System.out.println("Product added.");
                    break;
                case 3:
                    String ref = readText("Reference: ");
                    int qty = readInt("New quantity: ");
                    if (store.modifyQuantity(ref, qty)) System.out.println("Quantity updated.");
                    else System.out.println("Product not found.");
                    break;
                case 4:
                    store.display();
                    break;
                case 5:
                    Product p = store.search(readText("Reference: "));
                    if (p != null) System.out.println(p);
                    else System.out.println("Product not found.");
                    break;
                case 6:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}