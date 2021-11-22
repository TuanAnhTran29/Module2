public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);


        circle= new Circle(9.0, "red");
        System.out.println(circle);


        Cylinder cylinder= new Cylinder();
        System.out.println(cylinder);

        cylinder= new Cylinder(5.0,"black", 8.0);
        System.out.println(cylinder);


    }


}
