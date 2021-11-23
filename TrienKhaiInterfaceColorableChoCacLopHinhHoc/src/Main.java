public class Main {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[2];
        shapes[0]= new Circle();
        shapes[1]= new Square();

        for (Shape shape: shapes){
            if (shape instanceof Square){
                Square square= (Square) shape;
                square.howToColor();
            }
        }


    }
}
