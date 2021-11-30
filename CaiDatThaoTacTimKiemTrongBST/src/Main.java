public class Main {
    public static void main(String[] args) {
        BST bst= new BST();

        bst.insert(8);
        bst.insert(10);
        bst.insert(6);
        bst.insert(4);
        bst.insert(20);

        System.out.println(bst.search(bst.getRoot(), 20).key);

        System.out.println(bst.deleteRec(bst.getRoot(),4).key);

    }



}
