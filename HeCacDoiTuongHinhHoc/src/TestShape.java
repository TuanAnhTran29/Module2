public class TestShape {
    public static void main(String[] args) {
        Shape shape= new Shape();
        System.out.println(shape);

        shape= new Shape("red",false);
        System.out.println(shape);


        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false , 3.5);
        System.out.println(circle.toString());


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.8, 2.3);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 3.8, 2.5);
        System.out.println(rectangle);



        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("Yellow", true, 5.8);
        System.out.println(square);

    }
}
