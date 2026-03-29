/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       return lCA(root,root,p,q);
    }
    TreeNode lCA(TreeNode root,TreeNode parent,TreeNode p,TreeNode q){
        TreeNode pt=null;
        if(root==null)
        return null;
        if(root==p||root==q){
           return root;
        }
        TreeNode left=lCA(root.left,root,p,q);
        TreeNode right=lCA(root.right,root,p,q);
        if(left!=null && right!=null)
        return root;
        return left!=null?left:right;
    }
}
