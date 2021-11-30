public class Node {
    protected int key;
    protected Node right;
    protected Node left;


    public Node(int element) {
        this.key = element;
        left= right= null;
    }
}
