import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy sortStrategy;
    private List<String> list= new ArrayList<>();

    public void setSortStrategy(SortStrategy sortStrategy){
        this.sortStrategy= sortStrategy;
    }

    public void add(String name){
        list.add(name);
    }

    public void sort(){
        sortStrategy.sort(list);
    }
}
