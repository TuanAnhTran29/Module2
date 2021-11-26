public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList= new MyLinkedList<Integer>();

        myLinkedList.add(100);
        myLinkedList.add(1200);
        myLinkedList.add(1300);
        myLinkedList.add(1400);
        myLinkedList.add(1500);
        myLinkedList.remove(2);

        for (int i=0; i< myLinkedList.size(); i++){
            System.out.println(myLinkedList.get(i));
        }


    }



}
