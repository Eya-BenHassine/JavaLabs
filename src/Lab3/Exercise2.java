package Lab3;

import java.util.Vector;

public class Exercise2 {

    public static double findHighestTemperature(Vector<Double> t) {
        double max = t.get(0);
        for (double v : t) {
            if (v > max) max = v;
        }
        return max;
    }

    public static double findLowestTemperature(Vector<Double> t) {
        double min = t.get(0);
        for (double v : t) {
            if (v < min) min = v;
        }
        return min;
    }

    public static int countAbove24(Vector<Double> t) {
        int count = 0;
        for (double v : t) {
            if (v > 24) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Vector<Double> temperatures = new Vector<>();
        temperatures.add(22.5);
        temperatures.add(25.0);
        temperatures.add(19.5);
        temperatures.add(28.0);
        temperatures.add(24.5);

        for (double v : temperatures) {
            System.out.println(v);
        }

        System.out.println("Maximum = " + findHighestTemperature(temperatures));
        System.out.println("Minimum = " + findLowestTemperature(temperatures));
        System.out.println("Above 24 = " + countAbove24(temperatures));
    }
}