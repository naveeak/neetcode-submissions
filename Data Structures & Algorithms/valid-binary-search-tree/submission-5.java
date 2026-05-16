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
    public boolean isValidBST(TreeNode root) {

        // if(root == null || (root.left == null && root.right == null)) return true;

        // boolean isLeftOkay = (root.left == null) || (root.left != null && root.val > root.left.val && isValidBST(root.left));
        // boolean isRightOkay = (root.right == null) || (root.right != null && root.val < root.right.val && isValidBST(root.right));
        // System.out.println(root.val + "" +isLeftOkay+isRightOkay);
        // return isLeftOkay && isRightOkay;

        return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    }

    public boolean valid(TreeNode node, int min, int max){
        if(node == null){
            return true;
        }

        if(!(node.val > min && node.val < max)){
            return false;
        }

        return valid(node.right, node.val, max) &&
            valid(node.left, min, node.val);

    }
}
