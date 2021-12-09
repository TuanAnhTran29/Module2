public class Main {
    public static void main(String[] args) {
        ValidateClass validateClass= new ValidateClass();

        String validClass= "C0318G";
        String[] invalidClass= {"M0318G", "P0323A"};


        System.out.println("Class " + validClass + " is valid " + validateClass.validate(validClass));


        for (String s: invalidClass){
            System.out.println("Class " + s + " is valid " + validateClass.validate(s));
        }
    }
}
