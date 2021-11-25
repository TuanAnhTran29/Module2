import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test
    @DisplayName("test 1/1/2018")
    public void testDay1Month1Year2018(){
        int day= 1;
        int month= 1;
        int year= 2018;
        String expected= "2/1/2018";

        String result= NextDayCalculator.getNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test 31/1/2018")
    public void testDay31Month1Year2018(){
        int day= 31;
        int month= 1;
        int year= 2018;
        String expected= "1/2/2018";

        String result= NextDayCalculator.getNextDay(day,month,year);

        assertEquals(expected,result);
    }


    @Test
    @DisplayName("test 30/4/2018")
    public void testDay30Month4Year2018(){
        int day= 30;
        int month= 4;
        int year= 2018;
        String expected= "1/5/2018";

        String result= NextDayCalculator.getNextDay(day,month,year);

        assertEquals(expected,result);
    }


    @Test
    @DisplayName("test 28/2/2018")
    public void testDay28Month2Year2018(){
        int day= 28;
        int month= 2;
        int year= 2018;
        String expected= "1/3/2018";

        String result= NextDayCalculator.getNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test 28/2/2020")
    public void testDay29Month2Year2020(){
        int day= 29;
        int month= 2;
        int year= 2020;
        String expected= "1/3/2020";

        String result= NextDayCalculator.getNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test 31/12/2018")
    public void testDay31Month12Year2018(){
        int day= 31;
        int month= 12;
        int year= 2018;
        String expected= "1/1/2019";

        String result= NextDayCalculator.getNextDay(day,month,year);

        assertEquals(expected,result);
    }


}