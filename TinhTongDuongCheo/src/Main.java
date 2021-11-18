import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:  ");
        int size = scanner.nextInt();
        System.out.println("Enter the length of the elements: ");
        int ele_length = scanner.nextInt();

        int[][] arr = new int[size][ele_length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter a value: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        System.out.println("The sum is " + sum);
    }


}
