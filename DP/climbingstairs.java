class Solution {
    public int climbStairs(int n) {
        int [] a=new int[46];
        return climbstair(n,a);
    }
    int climbstair(int n,int[] a){
        if(a[n]!=0){
            return a[n];
        }
        if(n<=1)
        return 1;
       a[n]= climbstair(n-1,a)+climbstair(n-2,a);
       return a[n];
    }
}
