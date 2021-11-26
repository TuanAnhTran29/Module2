import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size= 0;
    private static final int DEFAULT_CAPACITY= 10;
    private Object elements[];

    public MyList() {
        elements= new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements= new Object[capacity];
    }

    public void ensureCapacity(int minCapacity){
        int newSize= elements.length + minCapacity ;
        elements= Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element){
        if (index == elements.length ){
            ensureCapacity(1);
        }

        for (int i= size - 1; i>= index; i--){
            elements[i+1] = elements[i];
        }

        elements[index]= element;
        size++;

    }

    public void checkIndex(int index){
        if (index< 0 || index >= size){
            System.out.println("Index " + index + " is not in the array!");
        }
    }

    public E remove(int index){
        checkIndex(index);

        E e= (E) elements[index];


        for (int i= index; i< size - 1; i++){
            elements[i]= elements[i+ 1];
        }

        size--;
        return e;

    }

    public int size(){
        return elements.length;
    }

    public List<E>  clone(){
        List<E> eList = new ArrayList<>();
        for (int i=0; i< elements.length; i++){
            eList.add((E) elements[i]);
        }

        return eList ;
    }

    public boolean contains(E o){
        boolean result= false;
        for (Object object : elements){
            if (o == object){
                result= true;
            }
        }
        return result;
    }

    public int indexOf(E o){
        int result =0;
        for (int i=0; i< size; i++){
            if (o == elements[i]){
                result= i;
            }else {
                result= -1;
            }
        }
        return result;
    }

    public boolean add(E o){
        if (size== elements.length){
            ensureCapacity(1);
        }
        elements[size]= o;
        return true;

    }

    public E get(int i){
        checkIndex(i);
        return (E) elements[i];
    }

    public void clear(){
        elements= new Object[DEFAULT_CAPACITY];
        size= 0;
    }


}
