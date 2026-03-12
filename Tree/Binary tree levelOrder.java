class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a= new ArrayList<>();
        if(root==null)return a;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> b=new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
            
            b.add(curr.val);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
            }
            a.add(b);

        }
        
        return a;
    }
}
