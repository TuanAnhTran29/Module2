import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int choice= -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    System.out.println("Enter the width of the rectangle: ");
                    int widthRect = scanner.nextInt();
                    System.out.println("Enter the height of the rectangle: ");
                    int heightRect = scanner.nextInt();

                    for (int i = 0; i < heightRect; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < widthRect; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;

                case 2:
                    System.out.println("2. Print the square triangle");
                    System.out.println("Enter the width of the square triangle");
                    int widthTria = scanner.nextInt();


                    System.out.println("Choose the corner square: ");
                    System.out.println("1. Top left");
                    System.out.println("2. Top right");
                    System.out.println("3. Bottom left");
                    System.out.println("4. Bottom Right");
                    System.out.println("Enter your choice: ");
                    int cornerChoice = scanner.nextInt();

                    switch (cornerChoice) {
                        case 1:
                            for (int i = widthTria; i >= 1; i--) {
                                System.out.println(" ");
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                            }
                            break;
                        case 2:
                            for (int i = widthTria; i >= 1; i--) {
                                for (int j = widthTria; j > i; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k < i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < widthTria; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println(" ");
                            }
                            break;

                        case 4:
                            for (int i = 0; i < widthTria; i++) {
                                for (int j = 1; j <= widthTria - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k <= i; k++) {
                                    System.out.print("*");

                                }
                                System.out.println(" ");

                            }
                            break;

                        default:
                            System.out.println("No choice!");
                    }
                    break;

                case 3:
                    System.out.println("Enter the width of the triangle: ");
                    int widthCan = scanner.nextInt();

                    for (int i = 0; i < widthCan; i++) {
                        for (int j = 0; j < widthCan - i; j++) {
                            System.out.print(" ");

                        }
                        for (int k = 0; k < 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;


                case 4:
                    System.exit(0);


                default:
                    System.out.println("No choice!");
            }
        }
    }
}
