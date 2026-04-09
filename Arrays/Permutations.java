class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used=new boolean[nums.length];
        backTrack(nums,used,new ArrayList<>());
        return result;
    }
    void backTrack(int[]nums,boolean[] used,List<Integer>temp){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            temp.add(nums[i]);
            used[i]=true;
            backTrack(nums,used,temp);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}
