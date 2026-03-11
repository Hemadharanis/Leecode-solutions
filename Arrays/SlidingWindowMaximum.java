
Java
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] a=new int[nums.length-k+1];
        Deque<Integer> dq=new LinkedList<>();
        int i=0;
        for(int j=0;j<nums.length;j++){
            while(!dq.isEmpty()&&dq.getFirst()<i){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[j]){
                dq.pollLast();
            }
            dq.offerLast(j);
            if(j-i+1==k){
            a[i]=nums[dq.peekFirst()];
            i++;
            }
        }
        return a;
    }
}
