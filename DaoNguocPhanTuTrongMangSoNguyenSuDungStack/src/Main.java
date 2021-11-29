import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<Integer>();
        Integer[] int_arr= {2,4,6,8,10};

        for (int i=0; i< int_arr.length; i++){
            stack.push(int_arr[i]);
        }

        for (int i=0; i< int_arr.length; i++){
            int_arr[i]= stack.pop();
        }

        System.out.println(Arrays.toString(int_arr));



        Stack<String> stringStack= new Stack<String>();
        String string= "Xin chao toi ten la Tuan Anh";
        String[] str_arr= string.split("");

        for (int i=0; i< str_arr.length;i++){
            stringStack.push(str_arr[i]);
        }

        for (int i=0; i< str_arr.length; i++){
            str_arr[i]= stringStack.pop();
        }

        String newString= String.join("", str_arr);

        System.out.println(newString);



    }
}
