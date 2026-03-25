class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> a=new ArrayList<>();
        for(int i=0;i<n+1;i++)
        a.add(new ArrayList<>());
        for(int i=0;i<times.length;i++){
            a.get(times[i][0]).add(new int[]{times[i][1],times[i][2]});
        }
        int[] d=new int[n+1];
        Arrays.fill(d,Integer.MAX_VALUE);
        

         PriorityQueue<int[]> pq=new PriorityQueue<>((c,b)->c[1]-b[1]);
             d[k]=0;
             pq.add(new int[]{k,0});
             while(!pq.isEmpty()){
                int[] ver=pq.poll();
                int v=ver[0];
                int dist=ver[1];

                for(int[] t:a.get(v)){
                    if(dist+t[1]<d[t[0]]){
                        d[t[0]]=dist+t[1];
                        pq.add(new int[]{t[0],dist+t[1]});
                    }
                }
               
             }
              int max=0;
                for(int i=1;i<n+1;i++){
                    if(d[i]==Integer.MAX_VALUE)return -1;
                    max=Math.max(max,d[i]);
                }
                return max;

    }
   
    
}
