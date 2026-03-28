class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int max=0;
        int count=0;
        int l=0;
        int r=0;
        while(r<s.length()){
            char a=s.charAt(r);
            freq[a-'A']++;
            count=Math.max(count,freq[a-'A']);
            if((r-l+1)-count>k){
                char c=s.charAt(l);
                freq[c-'A']--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
