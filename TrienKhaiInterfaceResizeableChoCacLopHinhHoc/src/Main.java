import shape.Circle;
import shape.Rectangle;
import shape.Resizeable;
import shape.Square;

public class Main {
    public static void main(String[] args) {
        Resizeable[] resizeables= new Resizeable[3];
        resizeables[0]= new Circle(10);
        resizeables[1]= new Rectangle(40,30);
        resizeables[2]= new Square(20);

        for (Resizeable resizeable: resizeables){
            if (resizeable instanceof Circle){
                Circle circle= (Circle) resizeable;
                circle.resize(50);
                System.out.println(circle);
            } else if (resizeable instanceof Rectangle){
                Rectangle rectangle= (Rectangle) resizeable;
                rectangle.resize(40);
                System.out.println(rectangle);
            }else {
                Square square= (Square) resizeable;
                square.resize(60);
                System.out.println(square);
            }
        }
    }
}
