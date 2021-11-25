public class TriangleClassifier {
    public static final String EQUILATERALTRIANGLE = "equilateral triangle";
    public static final String ISOSCELESTRIANGLE = "isosceles triangle";
    public static final String REGULARTRIANGLE = "regular triangle";




    public static String getTypeOfTriangle(int sideA, int sideB, int sideC){
        String typeOfTriangle= "";
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA) &&
                (sideA > 0) && (sideB > 0) && (sideC > 0)){
            if (sideA== sideB && sideB== sideC){

                typeOfTriangle= EQUILATERALTRIANGLE;

            }else if (sideA== sideB || sideA== sideC || sideB== sideC){

                typeOfTriangle= ISOSCELESTRIANGLE;

            }else {

                typeOfTriangle= REGULARTRIANGLE;

            }

        }else {
            typeOfTriangle= "not a triangle";
        }


        return typeOfTriangle;

    }
}
