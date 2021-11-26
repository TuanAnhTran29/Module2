public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger= new MyList<Integer>();

        listInteger.add(0, 100);
        listInteger.add(0, 1200);
        listInteger.add(1, 1300);
        listInteger.add(1, 1400);
        listInteger.add(10);


        listInteger.remove(3);

        for (int i=0; i< listInteger.size();i++){
            System.out.println(listInteger.get(i));
        }







    }
}
