public class Main {
    public static void main(String[] args) {
        Queue e= new Queue();

        Solution.enQueue(e, 10);
        Solution.enQueue(e, 30);
        Solution.enQueue(e, 50);

        Solution.displayQueue(e);

        Solution.deQueue(e);
        Solution.displayQueue(e);
    }
}
