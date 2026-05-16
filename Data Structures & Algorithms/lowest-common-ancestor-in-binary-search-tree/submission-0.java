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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return null;

        boolean leftc = checkIfPresent(root,p);
        boolean rightc = checkIfPresent(root,q);
        TreeNode leftT = lowestCommonAncestor(root.left,p,q);
        TreeNode rightT = lowestCommonAncestor(root.right,p,q);

        if(leftT !=null){
            return leftT;
        }

        if(rightT !=null){
            return rightT;
        }

        if(leftc && rightc){
            return root;
        } 

        return null;
        
    }

    public boolean checkIfPresent(TreeNode root, TreeNode s){
        if(root == null){
            return false;
        }

        return root.val == s.val || checkIfPresent(root.left, s) || checkIfPresent(root.right, s);
    }
}
