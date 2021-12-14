public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade= new SocialMediaFacade();
        socialMediaFacade.share(message);
    }

    public static void main(String[] args) {
        Client client= new Client();
        client.share("This is a post");
    }
}
