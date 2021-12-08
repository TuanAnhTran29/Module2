public class OddThread extends Thread {
    private String threadName;

    public OddThread(String threadName){
        this.threadName= threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <=10 ; i++) {
                if (i%2 != 0){
                    System.out.println("Odd number: " + i);
                    Thread.sleep(10);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
