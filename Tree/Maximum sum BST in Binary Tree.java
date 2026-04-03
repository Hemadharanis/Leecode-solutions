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
    int g_max=0;
    public int maxSumBST(TreeNode root) {
       maxSum(root);
       return g_max; 
    }
    public int[] maxSum(TreeNode root){
        if(root==null){
            return new int[]{1,0,Integer.MIN_VALUE,Integer.MAX_VALUE};
        }
        int[] left=maxSum(root.left);
        int[] right=maxSum(root.right);

        if(left[0]==1&&right[0]==1){
            if(root.val>left[2]&&root.val<right[3]){
                int sum=left[1]+right[1]+root.val;
                int min=Math.min(left[3],root.val);
                int max=Math.max(right[2],root.val);
                g_max=Math.max(sum,g_max);
                return new int[]{1,sum,max,min};
                
             }

        }
        return new int[]{0,0,0,0};
    }
}
