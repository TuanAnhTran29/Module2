import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> free_item= new LinkedList<>();

    public void freeItem(T item){
        free_item.add(item);
    }

    protected abstract T allocate();

    public T newItem(){
        T out= null;

        if (free_item.size() == 0){
            out= allocate();
        }else {
            out= free_item.getFirst();
            free_item.removeFirst();
        }
        return out;
    }
}
