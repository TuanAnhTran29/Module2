import java.util.Scanner;

public class FizzBuzzTranslate {

    public static String fizzBuzzTranslate(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;


        if (isFizz && isBuzz) {
            return "FizzBuzz";
        }
        if (isFizz){
            return "Fizz";
        }
        if (isBuzz){
            return "Buzz";
        }
//        if (number % 3 !=0 && number %5 != 0){
//            return number + "";
//        }
        return number + "";

    }

}
