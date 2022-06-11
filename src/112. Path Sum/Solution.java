/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public boolean duyet(TreeNode curNode, int curSum, int target) {
        curSum += curNode.val;
        if (isLeaf(curNode)) {
            return curSum == target;
        }
        if (curNode.left != null) {
            if (duyet(curNode.left, curSum, target)) {
                return true;
            }
        }
        if (curNode.right != null) {
            if (duyet(curNode.right, curSum, target)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        return duyet(root, 0, targetSum);
    }
}