import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<People> NAM= new LinkedList<People>();
        Queue<People> NU= new LinkedList<People>();

        People p1= new People("Tuan Anh", "nam", LocalDate.of(2003,10,29));
        People p2= new People("Hieu", "nam", LocalDate.of(2003,10,29));
        People p3= new People("Giang", "nam", LocalDate.of(2003,10,29));
        People p4= new People("Ho Chi Minh", "nu", LocalDate.of(2003,10,29));

        ArrayList<People> arrayList= new ArrayList<People>();

        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);

        for (People p: arrayList){
            if (p.getSex().equals("nu")){
                NU.add(p);
            }else {
                NAM.add(p);
            }
        }

        for (People people: NU) {
            System.out.println(people);
        }

        for (People people: NAM){
            System.out.println(people);
        }


    }







}
