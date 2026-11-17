package Lab2;

public class Sum {

    public static int sum(int[] tab) {
        int s = 0;
        for (int v : tab) {
            s += v;
        }
        return s;
    }

    public static int product(int[] tab) {
        int p = 1;
        for (int v : tab) {
            p *= v;
        }
        return p;
    }

    public static double average(int[] tab) {
        return (double) sum(tab) / tab.length;
    }

    public static void main(String[] args) {
        int[] tab = {1, 23, 12, -4, 6, 89, 2};

        System.out.println("Sum = " + sum(tab));
        System.out.println("Product = " + product(tab));
        System.out.println("Average = " + average(tab));
    }
}