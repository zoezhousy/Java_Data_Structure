public class ReversePrint {
    public static void reversePrint(int n, String str){
        if (n == str.length()) {
            return;
        }
        reversePrint(n+1, str);
        System.out.println(str.charAt(n));
    }

    public static void main(String[] args) {
        reversePrint(0, "abcd");
    }
}
