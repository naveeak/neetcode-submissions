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
    public TreeNode invertTree(TreeNode root) {
        return inverse(root);
    }

    public TreeNode inverse(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode temp = inverse(root.left);
        root.left = inverse(root.right);
        root.right = temp;
        return root;
    }
}
