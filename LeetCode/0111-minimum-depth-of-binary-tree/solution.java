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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int lefth = minDepth(root.left);
        int righth = minDepth(root.right);

        if(root.right == null) return lefth+1;
        if(root.left == null) return righth+1;
        
        int m = Math.min(lefth,righth);
        return m+1;
            
    }
}
