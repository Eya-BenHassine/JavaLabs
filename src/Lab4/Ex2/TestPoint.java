package Lab4.Ex2;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println("p1 norm = " + p1.norme()); // 0.0
        System.out.println("p2 norm = " + p2.norme()); // 5.0

        p1.setX(6);
        p1.setY(8);
        System.out.println("p1 = (" + p1.getX() + ", " + p1.getY() + ") norm = " + p1.norme()); // 10.0
    }
}
