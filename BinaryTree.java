public class BinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public int sumTreeKeys(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return root.val + sumTreeKeys(root.left) + sumTreeKeys(root.right);
        }
    }

    // Testing the binary tree
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        BinaryTree tree = new BinaryTree();
        int sum = tree.sumTreeKeys(root);
        System.out.println("The sum of all the keys in the binary tree is: " + sum);
    }
}
