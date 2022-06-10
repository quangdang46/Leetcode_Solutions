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
    public TreeNode insertIntoBST(TreeNode root,int value) {
        TreeNode newNode = new TreeNode(value);
        if(root == null) return newNode;
        TreeNode temp = root;
        while(true) {
            if(value>temp.val){//ben phai
                if(temp.right == null) {
                    temp.right = newNode;
                    break;
                }else{
                    temp = temp.right;
                }
            }else{
                if(temp.left == null) {
                    temp.left = newNode;
                    break;
                }else{
                    temp = temp.left;
                }
            }
        }
        return root;
    }
    
    
    public TreeNode insertIntoBST(TreeNode root,int value) {
        if(root == null) return new TreeNode(value);
        if(value<root.val){//kiem ben phai
            if(root.left == null){
                root.left = new TreeNode(value);
            }else{
                insertIntoBST(root.left,value);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode(value);
            }else{
                insertIntoBST(root.right,value);
            }
        }
        return root;
    }
}
