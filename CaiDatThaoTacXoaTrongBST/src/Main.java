public class Main {
    public static void main(String[] args) {
        BST bst= new BST();

        bst.insert(5);
        bst.insert(4);
        bst.insert(9);
        bst.insert(1);
        bst.insert(7);

//        bst.inorder();

//        Node root= new Node(5);

//        System.out.println(bst.search(bst.getRoot(), 1).key);

        System.out.println(bst.deleteRec(bst.getRoot(),9).key);

        bst.inorder();
    }
}
