public class OctObserver extends Observer {
    private Subject subject;

    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));

    }
}
