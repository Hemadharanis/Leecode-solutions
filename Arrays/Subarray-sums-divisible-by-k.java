class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int s=0;
        int c=0;
        a.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            int rem=s%k;
            if(rem<0)
            rem+=k;
            if(a.containsKey(rem)){
                c+=a.get(rem);
                 a.put(rem,a.get(rem)+1);
            
            }
           else{
            a.put(rem,1);
        }
        }
        return c;
    }
}
