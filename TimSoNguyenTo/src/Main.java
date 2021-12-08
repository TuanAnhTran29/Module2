import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= scanner.nextInt();
        LazyPrimeFactorization lazyPrimeFactorization= new LazyPrimeFactorization(number);
        OptimizedPrimeFactorization optimizedPrimeFactorization= new OptimizedPrimeFactorization(number);

        Thread thread1= new Thread(lazyPrimeFactorization);
        Thread thread2= new Thread(optimizedPrimeFactorization);

        thread1.start();
        thread2.start();

    }
}
