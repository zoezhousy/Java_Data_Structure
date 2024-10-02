public class InsertionSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j = i-1;
            int key = arr[i];
            
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;   
            }
            arr[j+1] = key;
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {3,7,1,0};
        sort(array);
        printArray(array);
    }
}
