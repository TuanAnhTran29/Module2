public class EmailExampleTest {
    public static void main(String[] args) {

        EmailExample emailExample= new EmailExample();
        String[] validEmail= {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        String[] invalidEmail= {"@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

        for (String email: validEmail) {
            boolean isValid= emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }

        for (String email: invalidEmail){
            boolean isValid= emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);

        }
    }
}
