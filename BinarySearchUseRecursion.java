public class BinarySearchUseRecursion {
    public static int f(int[] a, int target, int i, int j){
        if (i > j) {
            return -1;
        }
        
        int m = (i+j) >>> 1;
        if (target < a[m]) {
            return f(a, target, i, m-1);
        } else if (a[m] < target) {
            return f(a, target, m+1, j);
        } else{
            return m;
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 35, 40, 46};
        int m = f(a, 30, 0, a.length);
        System.out.println(m);
    }

}
