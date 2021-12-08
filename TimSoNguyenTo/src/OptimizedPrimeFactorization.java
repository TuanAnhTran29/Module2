import java.util.ArrayList;
import java.util.List;

public class OptimizedPrimeFactorization implements Runnable {
    private int number;

    public OptimizedPrimeFactorization(int number) {
        this.number= number;
    }

    @Override
    public void run() {
        List<Integer> primeList= new ArrayList<>();
        primeList.add(2);
        boolean result= true;
        for (int i = 3; i < this.number ; i++) {
            for (int j=2; j< Math.sqrt(i); j++){
                if (i % j == 0){
                    result= false;
                }
            }
            if (result){
                primeList.add(i);
            }
            result= true;

        }
        for (int i: primeList) {
            System.out.println("Optimized: " + i);
        }
    }
}
