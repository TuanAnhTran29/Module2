public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1= new NumberGenerator("Thread1", Thread.MAX_PRIORITY);
        NumberGenerator generator2= new NumberGenerator("Thread2", Thread.MIN_PRIORITY);



    }
}
