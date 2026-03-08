class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> a=new HashMap<>();
        for(String s:strs){
            char[] ss=s.toCharArray();
            Arrays.sort(ss);
            String n=Arrays.toString(ss);
            a.putIfAbsent(n,new ArrayList<>());
            a.get(n).add(s);
        }
        
        return new ArrayList<>(a.values());
    }
}
