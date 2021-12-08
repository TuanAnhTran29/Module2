public class NumberGenerator implements Runnable {
    private Thread thread;
    private String name;
    private int priority;

    public NumberGenerator(String name, int priority) {
        thread= new Thread(this, this.name= name);
        thread.setPriority(this.priority= priority);
        System.out.println("My thread created" + thread);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
            try {
                for (int i = 1; i <= 10 ; i++) {
                    System.out.println(thread.getName() + ": " + i + ", hashCode: " + thread.hashCode());
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("My thread interrupted");
            }
            System.out.println("My thread run is over");
    }
}
