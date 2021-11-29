import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<Integer>();

        System.out.println("Enter your number: ");
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();

        while (number > 0){
            stack.add(number%2);
            number= number/2;
        }

        for (int i= stack.size()-1; i >=0 ; i--){
            System.out.print(stack.get(i));
        }
    }

}
