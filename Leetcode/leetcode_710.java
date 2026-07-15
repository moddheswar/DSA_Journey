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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(val > root.val){
            if(root.right != null){
                insertIntoBST(root.right,val);
            }
            else{
                TreeNode temp = new TreeNode(val);
                root.right = temp;
            }
        }
        else if(val < root.val){
            if(root.left != null){
                insertIntoBST(root.left,val);
            }
            else{
                TreeNode temp = new TreeNode(val);
                root.left = temp;
            }
        }
        return root;
    }
}