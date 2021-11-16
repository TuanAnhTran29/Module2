import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter amount of money (dollar): ");
        int usd= scanner.nextInt();

        int vnd= usd * 23000;
        System.out.println(usd + " USD" + " = " + vnd + " VND" );


    }
}
