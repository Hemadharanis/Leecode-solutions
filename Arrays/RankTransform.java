class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int r=1;
        int[] rank=arr.clone();
        Arrays.sort(rank);
        for(int i=0;i<arr.length;i++){
            if(!a.containsKey(rank[i]))
            a.put(rank[i],r++);
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=a.get(arr[i]);
        }
        return arr;
    }
}
