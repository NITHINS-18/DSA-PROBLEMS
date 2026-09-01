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
          int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxsum=root.val;
        maxsumpath(root);
        return maxsum;
    }
    int maxsumpath(TreeNode root){
           if(root==null) return 0;
           int lmaxsum=Math.max(maxsumpath(root.left),0);
           int rmaxsum=Math.max(maxsumpath(root.right),0);
           maxsum=Math.max(maxsum,lmaxsum+rmaxsum+root.val);
           return Math.max(lmaxsum,rmaxsum)+root.val;
    }
}