

public class BinarySearchTree {
    TreeNode root = null;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            insert(null, root, value);
        }
    }


    private void insert(TreeNode parent, TreeNode node, int value) {
        if (node == null) {
            // Perform the insert
            if (value < parent.value) {
                parent.left = new TreeNode(value);
            }
        } else {
            if (value < node.value) {
                insert(node, node.left, value);
            } else {
                insert(node, node.right, value);
            }
        }
    }

    private class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

    }


}
