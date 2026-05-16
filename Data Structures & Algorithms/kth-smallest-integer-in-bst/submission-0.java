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
    List<Integer> list = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        System.out.println(list);
        return list.get(k-1);
    }

    public void dfs(TreeNode node, int k){
        if(node == null) return;
        dfs(node.left, k);
        list.add(node.val);
        dfs(node.right,k);
    }
}
