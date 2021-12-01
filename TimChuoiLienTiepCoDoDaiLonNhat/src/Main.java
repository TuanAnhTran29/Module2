import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input= scanner.nextLine();

        LinkedList<Character> list= new LinkedList<>();
        LinkedList<Character> max= new LinkedList<>();


        for (int i = 0; i < input.length(); i++) {
            if (list.size() > 1 && input.charAt(i) <= list.getLast() && list.contains(input.charAt(i))){
                list.clear();;
            }
            list.add(input.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character c: max) {
            System.out.print(c);
        }


    }
}
