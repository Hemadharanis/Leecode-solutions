class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0;
        HashMap<Integer,Integer> a=new HashMap<>();
        a.put(0,1);
        int s=0;
        int c=0;
        for(int j=0;j<nums.length;j++){
             s+=nums[j];
            if(a.containsKey(s-goal)){
                c+=a.get(s-goal);
            }
            a.put(s,a.getOrDefault(s,0)+1);
        }
        return c;
    }
}
