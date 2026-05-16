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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return false;

        if(isSameTree(root, subRoot)) return true;

        if(root.left != null && isSameTree(root.left, subRoot)) return true;

        if(root.right != null && isSubtree(root.right,subRoot)) return true;
        return false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q ==null){
            return true;
        }else if(p==null || q ==null){
            return false;
        }

        Boolean isRight = isSameTree(p.right, q.right);
        Boolean isLeft = isSameTree(p.left, q.left);

        return isRight && isLeft && p.val == q.val ;

    }
}
