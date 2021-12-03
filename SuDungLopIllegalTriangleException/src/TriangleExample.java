import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter side 1 of the triangle: ");
        int side1= scanner.nextInt();
        System.out.println("Enter side 2 of the triangle: ");
        int side2= scanner.nextInt();
        System.out.println("Enter side 3 of the triangle: ");
        int side3= scanner.nextInt();

        try {
            checkTriangle(side1,side2,side3);
        } catch (IllegalTriangleException e) {
            System.err.println("These are not 3 sides of triangle");
        }


    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || b + c < a && a < 0 || b < 0 || c < 0 ){
            throw new  IllegalTriangleException("These are not 3 sides of triangle");
        }else {
            System.out.println("These are 3 sides of triangle");
        }
    }


}
