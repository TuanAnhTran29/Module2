import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a length: ");
        int numbers= sc.nextInt();

        int count= 0;
        int N= 2;
        boolean isPrime= true;

        while (count< numbers){
            for (int i=2; i<= Math.sqrt(N); i++){
                if (N % i == 0){
                    isPrime= false;
                    break;


                }

            }
            if (isPrime){
                System.out.print(N + " ");
                count++;

            }
            isPrime= true;
            N++;
        }
    }
}
