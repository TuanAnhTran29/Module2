import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack= new Stack<Character>();

        String string= "s * (s – a) * s – b) * (s – c)  ";

        boolean status = true;
        for (int i=0; i< string.length(); i++){
            if (string.charAt(i) == '('){
                stack.push(string.charAt(i));
            }else if (string.charAt(i) == ')'){
                if (stack.isEmpty() || stack.pop() != '(' ){
                    status= false;
                    break;
                }
            }
        }
        if (stack.isEmpty() && status == true){
            System.out.println("Well");
        }else {
            System.out.println("???");
        }
    }



}
