public class Main {
    public static void main(String[] args) {
        Point point= new Point(1,2);
        MovablePoint movablePoint= new MovablePoint(1,2,3,4);

        float[] arr1= point.getXY();

        System.out.println(arr1[1]);

        System.out.println(movablePoint.move());

    }
}
