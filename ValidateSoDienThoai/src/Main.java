public class Main {
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber= new ValidatePhoneNumber();

        String validNumber= "(84)-(0978489648)";
        String invalidNumber= "(a8)-(22222222)";


        System.out.println("Phone number " + validNumber + " is valid " + validatePhoneNumber.validate(validNumber));
        System.out.println("Phone number " + invalidNumber + " is valid " + validatePhoneNumber.validate(invalidNumber));
    }
}
