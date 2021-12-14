public class SocialMediaFacade {
    private Facebook facebook;
    private Linkedln linkedln;
    private Twitter twitter;

    public SocialMediaFacade() {
        this.facebook = new Facebook();
        this.linkedln = new Linkedln();
        this.twitter = new Twitter();
    }

    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedln.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.facebook.share();
    }
}
