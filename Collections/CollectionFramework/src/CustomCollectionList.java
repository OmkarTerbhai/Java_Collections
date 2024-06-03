import java.util.Iterator;
import java.util.List;

public class CustomCollectionList<T> implements Iterable<T> {
    T[] list;
    int size;

    public CustomCollectionList(T[] list) {
        this.list = list;
        this.size = this.list.length;
    }

    public void addLast(T ele) {
        this.list[size-1] = ele;
    }

    public T getLast() {
        T ret  = this.list[size-1];
        size--;
        return ret;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomCollectionListIterator(this);
    }

    private class CustomCollectionListIterator implements Iterator<T> {

        CustomCollectionList<T> list;

        public CustomCollectionListIterator(CustomCollectionList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("Inside overriden hasNext");
            return size!= 0;
        }

        @Override
        public T next() {
            System.out.println("Inside overriden next");
            return this.list.getLast();
        }
    }
}
