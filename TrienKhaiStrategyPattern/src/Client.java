public class Client {
    public static void main(String[] args) {
        UserController userController= new UserController(new MySQLStorage());

        userController.store(new User());


    }
}
