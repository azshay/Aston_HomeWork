import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {
    private Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    //REMOVE AFTER TEST
    public void getAllList() {
        for (Object element : elements) {
            System.out.println(element);
        }
    }
    //REMOVE AFTER TEST

    public boolean addAll(Collection<? extends T> collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }

        while (size + collection.size() > elements.length) {
            resizeArray();
        }

        for (T element : collection) {
            elements[size] = element;
            size++;
        }

        return true;
    }

    public boolean addAll(int index, Collection<? extends T> collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }

        if (size + collection.size() > elements.length) {
            resizeArray(size + collection.size() + 1);
        }

        int iterator = 0;
        int oldSize = size;

        for (T element : collection) {
            elements[iterator + oldSize] = elements[iterator + index];
            elements[iterator + index] = element;
            iterator++;
            size++;
        }

        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean add(T element) {
        if (size == elements.length) {
            resizeArray();
        }

        elements[size] = element;
        size++;

        return true;
    }

    public boolean add(int index, T element) {
        if (size == elements.length) {
            resizeArray();
        }

        if (index > size) {
            return false;
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = element;
        size++;

        return true;
    }

    public Object get(int index) {
        if (index >= size) {
            return null;
        }

        return elements[index];
    }

    public int remove(int index) {
        if (index >= size) {
            return -1;
        }

        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
        elements[size] = null;

        return index;
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                remove(i);
                return true;
            }
        }

        return false;
    }

    public void resizeArray(int size) {
        Object[] tempArray = new Object[size];
        System.arraycopy(elements, 0, tempArray, 0, elements.length);
        elements = tempArray;
    }

    public void resizeArray() {
        resizeArray((int) (elements.length * 1.5) + 1);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]).append(", ");
        }
        sb.append(elements[size - 1]).append("]");
        return sb.toString();
    }
}
