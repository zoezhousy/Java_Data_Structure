package Learning;

public class DynamicArray {
    private int size = 0; 
    private int capacity = 8;
    private int[] array = new int[capacity];

    public void addLast(int element){
        array[size] = element;
        size++;
    }

    public void add(int element, int index){
        if (index>=0 && index<size) {
            System.arraycopy(array, index, array, index+1, size-index);
            array[index] = element;
            size++;
        }

        else if(index == size){
            addLast(element);
        }
    }

    public void printArray(){
        for(int i = 0; i<size; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        //Do the test
        DynamicArray arr = new DynamicArray();
        arr.addLast(3);
        arr.addLast(4);
        arr.add(0, 1);
        arr.printArray(); // the output should be 3 0 4
    }
}
