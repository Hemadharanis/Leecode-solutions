class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int[] count = new int[26];

        // fill pattern
        for(char c : p.toCharArray()){
            count[c - 'a']++;
        }

        int i = 0, j = 0, k = p.length();

        while(j < s.length()){
            char c = s.charAt(j);
            count[c - 'a']--;

            if(count[c - 'a'] >= 0){
                k--;
            }

            if(j - i + 1 > p.length()){
                char left = s.charAt(i);
                if(count[left - 'a'] >= 0){
                    k++;
                }
                count[left - 'a']++;
                i++;
            }

            if(k == 0){
                res.add(i);
            }

            j++;
        }

        return res;
    }
}
