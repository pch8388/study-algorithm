package me.leetcode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum, 0);
    }

    boolean dfs(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }

        int sumVal = sum + root.val;

        // leaf
        if (root.left == null && root.right == null) {
            return targetSum == sumVal;
        }

        boolean isLeftSum = false;
        if (root.left != null) {
            isLeftSum = dfs(root.left, targetSum, sumVal);
        }

        boolean isRightSum = false;
        if (root.right != null) {
            isRightSum = dfs(root.right, targetSum, sumVal);
        }

        return isLeftSum || isRightSum;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


