public class Main {
    public static void main(String[] args) {
        Point2D point2D= new Point2D();
        System.out.println(point2D);

        Point3D point3D= new Point3D();
        System.out.println(point3D);

        Point2D p1= new Point3D(3,4,5);
        System.out.println(p1.getX());
    }
}
