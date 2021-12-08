public class Main {
    public static void main(String[] args) {
        OddThread oddThread= new OddThread("oddThread");
        EvenThread evenThread= new EvenThread("evenThread");

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
    }



}
