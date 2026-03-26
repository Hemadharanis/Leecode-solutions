class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] freq=new int[26];
        for(char a:s1.toCharArray()){
            freq[a-'a']++;
        }
        int i=0;
        int j=0;
        int k=s1.length();
        while(j<s2.length()){
            char s=s2.charAt(j);
            
            freq[s-'a']--;
            if(freq[s-'a']>=0)
            k--;
            if(j-i+1>s1.length()){
                char d=s2.charAt(i);
                if(freq[d-'a']>=0)
                k++;
                freq[d-'a']++;
                i++;
            }
            if(k==0)
            return true;
            j++;
        }
        return false;
    }
}
