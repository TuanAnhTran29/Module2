import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int[] arr= {1,4,6,8,8,4,6,3};

        System.out.println("Enter the element you want to add: ");
        int ele= scanner.nextInt();

        System.out.println("Enter the position you want to add the element: ");
        int index= scanner.nextInt();

        int[] newArr = new int[arr.length +1 ];

        for (int i=0; i < index; i++){
            newArr[i]= arr[i];

        }

        newArr[index]= ele;

        for (int j= index; j< arr.length; j++){
            newArr[j+1]= arr[j];
        }
        for (int i=0; i< newArr.length; i++){
            System.out.print(newArr[i] + "\t");
        }





    }
}
