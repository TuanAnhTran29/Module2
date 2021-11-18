import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String str= "Xin chao toi la Tran Quoc Tuan Anh";
        String[] arr= str.split("");


        while (true) {
            System.out.println("Enter the letter: ");
            String a = scanner.nextLine();

            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (a.equals(arr[i])) {
                    count++;
                }

            }

            System.out.println("The letter " + a + " appears " + count + " times");
        }




    }
}
