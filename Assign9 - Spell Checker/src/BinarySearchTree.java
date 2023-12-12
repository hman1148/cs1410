public class BinarySearchTree <E extends Comparable<E>> {
    TreeNode root;
    private class TreeNode {
        E value;
        TreeNode left;
        TreeNode right;
        public TreeNode(E value) {
            this.value = value;
        }
    }
    public boolean insert(E value) {
        if (root == null) {
            root = new TreeNode(value);
            return true;
        }
        return this.insert(null, root, value);
    }
    private boolean insert(TreeNode parent, TreeNode node, E value) {
        boolean inserted = false;
        if (node == null) {
            // Perform the insert
            if (value.compareTo(parent.value) > 0) {
                parent.right = new TreeNode(value);
                inserted = true;

            } else if (value.compareTo(parent.value) < 0) {
                parent.left = new TreeNode(value);
                inserted= true;
            }
        } else {
            if (value.compareTo(node.value) < 0) {
                inserted = this.insert(node, node.left, value);
            } else if (value.compareTo(node.value) > 0) {
                inserted = this.insert(node, node.right, value);
            }
        }
        return inserted;
    }
    public boolean remove(E value) {
        TreeNode parent = null;
        TreeNode node = root;

        boolean done = false;
        while (!done) {
            if (node == null) {
                return false;
            }
           if (value.compareTo(node.value) < 0) {
               parent = node;
               node = node.left;
           } else if (value.compareTo(node.value) > 0) {
               parent = node;
               node = node.right;
           } else {
               done = true;
           }
        }
        // check for left child
        if (node.left != null) {
            TreeNode parentOfRight = node;
            TreeNode rightMost = node.left;

            while (rightMost.right != null) {
                parentOfRight = rightMost;
                rightMost = rightMost.right;
            }
            // rightMost has the largest value in the left subtree
            node.value = rightMost.value;
            if (parentOfRight.right == rightMost) {
                parentOfRight.right = rightMost.left;
            } else {
                parentOfRight.left = rightMost.left;
            }
        } else {
            if (parent == null) {
                root = root.right;
            } else {
                if (parent.left == node) {
                    parent.left = node.right;
                } else {
                    parent.right = node.right;
                }
            }
        }
        return true;
    }
    public boolean search(E value) {
        TreeNode parent = null;
        TreeNode node = root;

        while (true) {
            if (node == null) {
                return false;
            }
            if (value.compareTo(node.value) < 0) {
                parent = node;
                node = node.left;
            } else if (value.compareTo(node.value) > 0) {
                parent = node;
                node = node.right;
            } else {
                return true;
            }
        }
    }
    public void display(String message) {
        System.out.println(message);
        this.traverseInOrder(root);
    }

    private void traverseInOrder(TreeNode node) {
        if (node != null) {
            this.traverseInOrder(node.left);
            System.out.println(node.value);
            this.traverseInOrder(node.right);
        }
    }
    public int numberNodes() {
        return this.numberNodes(root);
    }
    private int numberNodes(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + numberNodes(node.left) + numberNodes(node.right);
        }
    }
    public int numberLeafNodes() {
        return this.numberOfLeafNodes(root);
    }
    private int numberOfLeafNodes(TreeNode node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return 1;
        } else {
            return this.numberOfLeafNodes(node.right) + this.numberOfLeafNodes(node.left);
        }
    }
    public int height() {
        return this.height(root) - 1;
    }
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int heightLeft = this.height(node.left);
        int heightRight = this.height(node.right);

        if (heightLeft > heightRight) {
            return heightLeft + 1;
        } else {
            return heightRight + 1;
        }
    }
}