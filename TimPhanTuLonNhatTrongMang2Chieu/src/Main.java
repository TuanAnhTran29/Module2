import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int size= scanner.nextInt();
        System.out.println("Enter the length of the elements: ");
        int ele_length= scanner.nextInt();

        double[][] arr= new double[size][ele_length];

        for (int i=0; i< arr.length;i++){
            for (int j=0; j< arr[i].length ; j++  ){
                System.out.println("Enter a value ");
                int value= scanner.nextInt();
                arr[i][j]= value;
            }
        }

        double maxNum= arr[0][0];
        int x= 0;
        int y= 0;

        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                if (arr[i][j] > maxNum){
                    maxNum= arr[i][j];
                    x= i;
                    y= j;

                }
            }
        }

        System.out.println("The biggest number is " + maxNum + " in coordinates " + x + " , " + y);
    }
}
