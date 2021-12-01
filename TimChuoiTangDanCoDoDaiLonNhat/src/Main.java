import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input= scanner.nextLine();


        LinkedList<Character> max= new LinkedList<>();

        for (int i=0; i< input.length(); i++){
            LinkedList<Character> list= new LinkedList<>();
            list.add(input.charAt(i));
            for (int j= i+1; j< input.length();j++){
                if (input.charAt(j) > list.getLast()) {
                    list.add(input.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.addAll(list);
            }
            list.clear();
        }

        for (Character c: max){
            System.out.println(c);
        }
        System.out.println();

    }
}
