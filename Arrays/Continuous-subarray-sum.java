class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int s=0;
        HashMap<Integer,Integer> a=new HashMap<>();
        a.put(0,-1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            nums[i]=s;
            int rem=s%k;
            if(a.containsKey(rem)){
                if(i-a.get(rem)>1)
                return true;
            }
            else
            a.put(rem,i);
                }
        return false;
    }
}
