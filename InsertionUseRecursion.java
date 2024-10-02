public class InsertionSortUseRecursion {
    private static void insertion(int[] arr, int low) {
        if (low == arr.length) {
            return;
        }
        int key = arr[low];
        int i = low - 1;

        while (i >= 0 && arr[i] > key) {
            arr[i + 1] = arr[i];
            i--;
        }

        if (i+1 != low) {
            arr[i + 1] = key;  
        }


        insertion(arr, low + 1);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        insertion(arr, 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 0 };
        sort(arr);
        printArray(arr);
    }
}
