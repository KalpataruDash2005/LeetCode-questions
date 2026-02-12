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
    public boolean check(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null ) return true;
        if(root1==null || root2==null ) return false;
        boolean condition1 = (root1.val == root2.val);
        boolean condition2 = check(root1.left,root2.right);
        boolean condition3 = check(root1.right,root2.left);

        return condition1&&condition2&&condition3;
    }
   
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        TreeNode root1 = root.left;
        TreeNode root2 = root.right;
        boolean result = check(root1,root2);
        return result;
    }
}
