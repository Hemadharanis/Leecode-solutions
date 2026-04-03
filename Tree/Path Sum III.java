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
    HashMap <Long, Integer> a=new HashMap<>();
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        a.put(0L,1);
        pathSumIII(root,targetSum,0);
        return count;
    }
    void pathSumIII(TreeNode root, int target,long cursum){
        if(root==null)
        return;
        cursum+=root.val;
        if(a.containsKey(cursum-target)){
            count+=a.get(cursum-target);
        }
        a.put(cursum,a.getOrDefault(cursum,0)+1);
       pathSumIII(root.left,target,cursum);
        pathSumIII(root.right,target,cursum);
         
         a.put(cursum,a.get(cursum)-1);
        
       
    }

}
