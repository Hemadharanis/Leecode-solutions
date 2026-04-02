class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(k,nums)-atMost(k-1,nums);
    }
    public int atMost(int n,int[] nums){
        int i=0;
        int a=0;
        int c=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2!=0)
            a++;
             while(a>n){
                if(nums[i]%2!=0)
                    a--;
                i++;
            }
            if(a<=n){
                c+=(j-i+1);
            }
        }
        return c;
    }
}
