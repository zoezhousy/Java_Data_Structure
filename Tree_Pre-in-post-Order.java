public class PreOrder_Tree {
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

    public static void preOrder(TNode root){
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TNode root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void postOrder(TNode root){
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
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

        System.out.println("Pre-order");
        preOrder(root);
        System.out.println(" ");

        System.out.println("In-order");
        inOrder(root);
        System.out.println(" ");


        System.out.println("Post-order");
        postOrder(root);
        System.out.println(" ");


    }
}
