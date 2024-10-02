public class TreeDeepest {
    public static class TNode {
        public int val;
        public TNode left;
        public TNode right;

        public TNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public TNode(TNode left, int val, TNode right) {
            this.left = left;
            this.val = val;
            this.right = right;
        }
    }

    public static int maxDepp(TNode root){
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right==null) {
            return 1;
        }
        int d1 = maxDepp(root.left);
        int d2 = maxDepp(root.right);
        return Integer.max(d1, d2) + 1;
    }

    public static void main(String[] args) {
        /*
         *       1
         *    2    3
         *  4     5  6
         */

        TNode root = new TNode(
        new TNode(new TNode(4), 2, null),
            1,
            new TNode(new TNode(5), 3, new TNode(6))
        );

        System.out.println(maxDepp(root)); 

    }
}
