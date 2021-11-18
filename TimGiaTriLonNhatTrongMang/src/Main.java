import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int size;
        int[] array;

        do {
            System.out.print("Enter a size: ");
            size= scanner.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }

        }while (size > 20);

        array= new int[size];
        for (int i=0 ; i< size; i++){
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i]= scanner.nextInt();

        }

        System.out.print("Property list: ");
        for (int j=0; j< size; j++){
            System.out.print(array[j] + "\t");
        }


        int max= array[0];
        int index= 1;

        for (int j=0; j< size; j++){
            if (array[j] > max){
                max= array[j];
                index= j+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}
