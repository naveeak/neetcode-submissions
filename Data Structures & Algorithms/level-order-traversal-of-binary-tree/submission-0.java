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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        addStat(root, result, 0);
        return result;
    }

    public void addStat(TreeNode root, List<List<Integer>> levelList, int level) {
        if (root == null) {
            return;
        }
        if (levelList.size() == level)
            // System.out.println(root.val +" " +level + "" + levelList);
            levelList.add(new ArrayList<Integer>());
        levelList.get(level).add(root.val);
        addStat(root.left, levelList, level + 1);
        addStat(root.right, levelList, level + 1);
    }
}