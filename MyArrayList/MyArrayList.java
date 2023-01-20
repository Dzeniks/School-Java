public class MyArrayList {
    // Místo: private E[] array = (E[])(new Object[5]);
    // Jsem se rozhodl využít: private Object[] array;
    // Možnosti vkládak jakýkoliv datový typ pro lepší flexibilitu jako je v Pythonu

    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[5];
        size = 0;
    }

    public void add(Object item) {
        ensureCapacity(size + 1);
        array[size] = item;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object[] tempArray = new Object[array.length-1];
                for(int i=0, k=0;i<array.length;i++){
                    if(i!=index){
                        tempArray[k]=array[i];
                        k++;
                    }
                }
        array = tempArray;
        size--;
    }

    public int size(){
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
          if (i > 0) {
            sb.append(", ");
          }
          sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    private void getDoubleArray(){
        int newCapacity = array.length * 2;
        Object[] newElements = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
          newElements[i] = array[i];
        }
        array = newElements;
    }

    private void ensureCapacity(int capacity) {
        if (capacity <= array.length) {
            return;
        }
        getDoubleArray();
    }
}
