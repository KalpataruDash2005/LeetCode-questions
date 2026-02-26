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
        List <List<Integer>> biglist = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null ) return biglist;
        queue.add(root);

        while(!queue.isEmpty()){
        int n = queue.size();
        List <Integer> list = new ArrayList<>();
        for(int i = 1;i<= n;i++){
            TreeNode person = queue.remove();
            list.add(person.val);
            if(person.left != null) queue.add(person.left);
            if(person.right != null) queue.add(person.right);
        }
        biglist.add(list);
        }
        return biglist;
    }
}
