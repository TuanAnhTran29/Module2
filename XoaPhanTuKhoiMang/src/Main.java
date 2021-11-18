import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arr= {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Enter element you want to delete: ");
        int ele= scanner.nextInt();

        int index_del= -1;

        for (int i=0; i < arr.length; i++) {
            if (ele == arr[i]) {
                index_del = i;
            }
        }
        if (index_del== -1){
            System.out.println(ele + " is not in the array");
        }else {
            System.out.println(ele + " is deleted");
        }

        int[] newArr= new int[arr.length -1];

        for (int j=0; j< index_del; j++){
            newArr[j]= arr[j];

        }

        for (int k= index_del; k< arr.length -1; k++){
            newArr[k]= arr[k+1];
        }

        for (int i=0; i< newArr.length; i++){
            System.out.print(newArr[i] + "\t");
        }



    }
}
