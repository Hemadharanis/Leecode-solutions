class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        int left=0;
        int r=0;
        int n=0;
        int max=0;
        while(r<s.length()){
            if(a.containsKey(s.charAt(r))){
                n=a.get(s.charAt(r));
                if(n>=left){
                    left=n+1;
                }
            }
        
            a.put(s.charAt(r),r);
            max=Math.max(max,r-left+1);
            r++;
        

        }
        return max;
        
    }
}
