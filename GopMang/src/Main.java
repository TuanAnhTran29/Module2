import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int[] arr1= {1,2,3,4,5,6,7,78,9};
        int[] arr2= {32,434,656,7643,6};

        int[] arr3= new int[arr1.length + arr2.length];

        for (int i=0; i< arr1.length; i++){
            arr3[i]= arr1[i];
        }

        for (int j=0; j< arr2.length; j++){
            arr3[j + arr1.length]= arr2[j];
        }

        System.out.println("The new array is: ");
        for (int i =0; i< arr3.length; i++){
            System.out.print(arr3[i] + "\t");
        }
    }
}
