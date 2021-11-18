import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the length of your array: ");
        int size= scanner.nextInt();

        double[] arr= new double[size];

        for (int i=0; i< size; i++){
            System.out.println("Enter the value: ");
            double value= scanner.nextDouble();
            arr[i]= value;
        }

        double minNum= arr[0];
        for (int i=1; i< size; i++){
            if (arr[i] < minNum){
                minNum= arr[i];
            }
        }

        System.out.println("The smallest number is " + minNum);
    }
}
