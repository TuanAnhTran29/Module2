import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    public void checkFizz(){
        int number= 3;
        String expected= "Fizz";

        String result= FizzBuzzTranslate.fizzBuzzTranslate(number);

        assertEquals(expected,result);
    }

    @Test
    public void checkBuzz(){
        int number= 5;
        String expected= "Buzz";

        String result= FizzBuzzTranslate.fizzBuzzTranslate(number);

        assertEquals(expected,result);
    }

    @Test
    public void checkFizzBuzz(){
        int number= 15;
        String expected= "FizzBuzz";

        String result= FizzBuzzTranslate.fizzBuzzTranslate(number);

        assertEquals(expected,result);
    }

    @Test
    public void checkNotFizzBuzz(){
        int number= 1;
        String expected= "1";

        String result= FizzBuzzTranslate.fizzBuzzTranslate(number);

        assertEquals(expected,result);
    }
}