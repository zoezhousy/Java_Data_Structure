public class BubbleSort {
    public static void Sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if (arr[j]> arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        printArray(arr);
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2,4,8,1,7};
        Sort(array);
    }
}
