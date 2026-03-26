class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> pattern=new HashMap<>();
        HashMap<Character,Integer> str=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            char a=p.charAt(i);
            pattern.put(a,pattern.getOrDefault(a,0)+1);
        }
        int sta=0;
        int e=0;
        while(e<s.length()){
            char a=s.charAt(e);
            str.put(a,str.getOrDefault(a,0)+1);
            if(e-sta+1>p.length()){
                char st=s.charAt(sta);
                str.put(st,str.get(st)-1);
                if(str.get(st)==0)
                str.remove(st);
                sta++;
            }
            if(e-sta+1==p.length()){
                if(str.equals(pattern))
                res.add(sta);
            }
            e++;

        }
    return res;
    }
}
