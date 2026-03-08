class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int s=0;
        int m=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
             s+=nums[j];
            while(s>=target){
                m=Math.min(m,j-i+1);
                s-=nums[i];
                 i++;
            
            }
           
            
        }
       return m==Integer.MAX_VALUE? 0: m;
    }
}
