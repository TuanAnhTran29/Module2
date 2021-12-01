import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();

        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(10);
        arrayList.add(78);
        arrayList.add(65);
        arrayList.add(22);
        arrayList.add(11);

        Comparator<Integer> comparator= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 == o2) {
                    return 0;
                }else {
                    return -1;
                }
            }
        };

        arrayList.sort(comparator);

        System.out.println(arrayList);

        System.out.println( binarySearch(arrayList, 0, arrayList.size()-1, 78 ) );


    }

    public static int binarySearch(ArrayList<Integer> array, int left, int right ,int value){
        while (right >= left){
            int middle= (left + right)/2;
            if (value == array.get(middle)){
                return array.get(middle);
            } else if (value > array.get(middle)) {
                left= middle +1;
            }else {
                right= middle - 1;
            }
        }
        return -1;
    }
}
