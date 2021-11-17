import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int length= 25 ;
        int count= 0;
        int N= 2;
        boolean isPrime = true;

        while (count< length){
            for (int i=2; i<= Math.sqrt(N); i++){
                if (N % i == 0){
                    isPrime= false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(N + " ");
                count++;
            }
            isPrime= true;
            N++;
        }
    }
}
