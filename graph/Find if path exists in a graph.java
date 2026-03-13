class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited=new boolean[n];
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ArrayList<>());
            }
        for(int[] edge:edges){
            a.get(edge[0]).add(edge[1]);
            a.get(edge[1]).add(edge[0]);
        }    
       return dfs(a,source,destination,visited);
    }
    boolean dfs(ArrayList<ArrayList<Integer>>adj, int source, int destination,boolean[] visited){
            visited[source]=true;
            if(source==destination)
            return true;
            for(int c:adj.get(source)){
                if(visited[c]==false){
                    if( dfs(adj,c,destination,visited))return true;
                }
            }
            return false;
    }
}
