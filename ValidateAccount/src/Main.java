public class Main {
    public static void main(String[] args) {
        AccountExample accountExample= new AccountExample();
        String[] validAccount= {"123abc_","_abc123","______","123456","abcdefg"};
        String[] invalidAccount= {".@","12345","1234_","abcde "};

        for (String account: validAccount) {
            boolean isValid= accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }

        for (String account: invalidAccount) {
            boolean isValid= accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }
    }
}
