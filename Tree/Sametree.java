class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        preorder(p,c);
        preorder(q,d);
        return c.equals(d);
    }
    void preorder(TreeNode a,List<Integer> b){
        if(a==null){
            b.add(null);
        }
        else{
        b.add(a.val);
        preorder(a.left,b);
        preorder(a.right,b);
        }
    }
}
