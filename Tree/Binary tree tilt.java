class Solution {
    int tilt;
    public int findTilt(TreeNode root) {
        til(root);
        return tilt;
    }
    int til(TreeNode root){
        if(root==null)
        return 0;
         int left=til(root.left);
         int right=til(root.right);

         tilt+=Math.abs(left-right);

         return(left+right+root.val);
    }
}
