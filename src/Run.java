public class Run {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        p1.setX(1);
        p1.setY(2);
        System.out.println(p1);

        Point3D p2 = new Point3D();
        p2.setXY(1,2);
        p2.setZ(3);
        System.out.println(p2);
    }
}
