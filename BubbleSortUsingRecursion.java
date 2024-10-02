public class BubbleUsingRecursion {
    public static void sort(int[] arr, int i){
        if (i==0) {
            return;
        }
        //set x to seperate sorting ordered and inordered interval
        int x = 0;
        for(int j=0; j<i; j++){
            if (arr[j] > arr[j+1]) {
            swap(arr, j, j+1);
            x = j;
            }
        }
        sort(arr, x);
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
        int[] arr = {3,1,6,5};
        sort(arr, arr.length-1);
        printArray(arr);
    }
}
