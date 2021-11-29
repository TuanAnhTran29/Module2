import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack= new Stack<Character>();
        String input= "madam";

//        System.out.println(input);


        for (int i=0; i< input.length(); i++){
            stack.add(input.charAt(i));
        }

        String reverse= "";

        while (!stack.isEmpty()){
            reverse= reverse + stack.pop();
        }
//        System.out.println(reverse);

        if (input.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }


}
