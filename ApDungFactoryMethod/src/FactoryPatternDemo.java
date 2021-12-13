public class FactoryPatternDemo {
    public static void main(String[] args) {
        Circle circle= new Circle();
        Rectangle rectangle= new Rectangle();
        Square square= new Square();

        ShapeFactory shapeFactory= new ShapeFactory();

        Shape shape= shapeFactory.getShape(circle);
        shape.draw();

        Shape shape1= shapeFactory.getShape(rectangle);
        shape1.draw();



    }
}
