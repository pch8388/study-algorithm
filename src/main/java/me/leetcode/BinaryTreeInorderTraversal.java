package me.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(root);
        return result;
    }

    static List<Integer> result;
    void dfs(TreeNode root) {
        if (root.left != null) {
            dfs(root.left);
        }
        result.add(root.val);
        if (root.right != null) {
            dfs(root.right);
        }
    }

    static class TreeNode {
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

}

