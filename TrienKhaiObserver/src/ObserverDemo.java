import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject= new Subject();
        new HexObserver(subject);
        new OctObserver(subject);
        new BinObserver(subject);
        Scanner scanner= new Scanner(System.in);

        for (int i=0; i< 5; i++){
            System.out.println("Enter a number");
            subject.setState(scanner.nextInt());
        }
    }
}
