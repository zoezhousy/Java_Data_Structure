package Learning;

import java.util.Iterator;

public class DynamicArray implements Iterable<Integer> {
    private int size = 0;
    private int capacity = 8;
    private int[] array = new int[capacity];
 
    public void addLast(int element){
        checkAndGrow();
        array[size] = element;
        size++;
    }

    public void add(int element, int index){
        checkAndGrow();

        if (index>=0 && index<size) {
            System.arraycopy(array, index, array, index+1, size-index);
            array[index] = element;
            size++;
        }

        else if(index == size){
            addLast(element);
        }
    }

    private void checkAndGrow() {
        //Check the capacity
        if (size == capacity) {
            //expand capaciry, times 1.5
            capacity += capacity >> 1;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }  

    public int delete(int index){
        int removed = array[index];
        if (index>=0 && index < size) {
            System.arraycopy(array, index+1, array, index, size-index-1);
        }

        size--;
        return removed;
    }

    public void printArray(){
        for(int i = 0; i<size; i++){
            System.out.print(array[i] + " ");
        }
    }

    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            int i = 0;
            public boolean hasNext(){
                return i<size;
            }

            public Integer next(){
                return array[i++];
            }
        };
    }

    public static void main(String[] args) {
        //Do the test
        DynamicArray arr = new DynamicArray();
        arr.addLast(3);
        arr.addLast(4);
        arr.add(0, 1);
        arr.addLast(10);
        arr.delete(0);

        for(Integer element : arr){
            System.out.println(element);
        }

    }
}
