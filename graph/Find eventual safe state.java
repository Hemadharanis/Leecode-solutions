class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        int[] outdegree=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            al.add(new ArrayList<>());}
            for(int i=0;i<graph.length;i++){
            for(int val:graph[i]){
            al.get(val).add(i);
            outdegree[i]++;
            }
        }
        List<Integer> a=new ArrayList<>();
        isCycle(al,outdegree,a);
        Collections.sort(a);
        return a;
    }
    List<Integer> isCycle(ArrayList<ArrayList<Integer>> al,int[]outdegree,List<Integer> a){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<outdegree.length;i++){
            if(outdegree[i]==0){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            int node=q.poll();
            a.add(node);
            for(int adj:al.get(node)){
                outdegree[adj]--;
                if(outdegree[adj]==0){
                    q.add(adj);
                }
            }
            
        }
        return a;
    }
}
