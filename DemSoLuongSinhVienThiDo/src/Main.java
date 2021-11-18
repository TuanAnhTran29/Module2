import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int size;
        int[] arr;

        do {
            System.out.print("Enter a size: ");
            size= scanner.nextInt();
            if (size > 30){
                System.out.println("Size should not exceed 30");
            }
        }while (size > 30);

        arr= new int[size];

        for (int i=0; i< size; i++){
            System.out.println("Enter a mark for student " + (i + 1) + ":");
            arr[i]= scanner.nextInt();
        }

        int count= 0;
        System.out.println("List the mark: ");
        for (int i=0; i< size; i++){
            System.out.println(arr[i] + "\t");
            if (arr[i] >= 5  && arr[i] <= 10){
                count++;
            }
        }

        System.out.print("\n The number of students passing the exam is " + count);
    }
}
