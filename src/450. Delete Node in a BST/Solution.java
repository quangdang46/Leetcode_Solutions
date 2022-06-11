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
    public TreeNode findLastLeft(TreeNode root) {
        if (root.left == null)
            return root;
        return findLastLeft(root.left);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(key<root.val){
            root.left = deleteNode(root.left,key);
        }else if(key>root.val){
            root.right = deleteNode(root.right,key);
        }else{
            //nut la
            if(root.left == null&& root.right == null){
                return null;
            }
            //ben phai
            if(root.left == null && root.right != null){
                return root.right;
            }
            //ben trai
            if(root.left != null && root.right == null){
                return root.left;
            }
            //ton tai hai con
            //tim node trai cung cay con ben phai
            TreeNode lastLeft = findLastLeft(root.right);
            root.val = lastLeft.val;
            root.right = deleteNode(root.right,lastLeft.val);
        }
        return root;
    }
}