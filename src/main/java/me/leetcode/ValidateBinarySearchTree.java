package me.leetcode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return solve(root, null, null);
    }

    boolean solve(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int currentVal = node.val;
        if (lower != null && currentVal <= lower) return false;
        if (upper != null && currentVal >= upper) return false;

        if (!solve(node.left, lower, currentVal)) return false;
        if (!solve(node.right, currentVal, upper)) return false;

        return true;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
