import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the length of the array:  ");
        int size= scanner.nextInt();
        System.out.println("Enter the length of the elements: ");
        int ele_length= scanner.nextInt();

        int[][] arr= new int[size][ele_length];

        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                System.out.println("Enter a value: ");
                arr[i][j]= scanner.nextInt();
            }

        }

        System.out.println("Enter the column you want to sum: ");
        int col= scanner.nextInt();

        int sum= 0;

        for (int i=0; i< arr.length; i++){
            sum+= arr[i][col];
        }

        System.out.println("The sum of column " + col + " is " + sum);


    }
}
