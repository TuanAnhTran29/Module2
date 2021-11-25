import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    @DisplayName("equilateral triangle")
    public void testEquilateralTriangle(){
        int sideA= 2;
        int sideB= 2;
        int sideC= 2;
        String expected= "equilateral triangle";

        String result= TriangleClassifier.getTypeOfTriangle(sideA,sideB,sideC);

        assertEquals(expected, result);

    }


    @Test
    @DisplayName("isosceles triangle")
    public void testIsoscelesTriangle(){
        int sideA= 2;
        int sideB= 2;
        int sideC= 3;
        String expected= "isosceles triangle";

        String result= TriangleClassifier.getTypeOfTriangle(sideA,sideB,sideC);

        assertEquals(expected, result);

    }

    @Test
    @DisplayName("regular triangle")
    public void testRegularTriangle(){
        int sideA= 2;
        int sideB= 3;
        int sideC= 4;
        String expected= "regular triangle";

        String result= TriangleClassifier.getTypeOfTriangle(sideA,sideB,sideC);

        assertEquals(expected, result);

    }

    @Test
    @DisplayName("not a triangle")
    public void testNotATriangle(){
        int sideA= -1;
        int sideB= 2;
        int sideC= 1;
        String expected= "not a triangle";

        String result= TriangleClassifier.getTypeOfTriangle(sideA,sideB,sideC);

        assertEquals(expected, result);

    }

}