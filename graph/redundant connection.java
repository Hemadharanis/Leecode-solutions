class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] a=new int[2];
        int[] parent=new int[n+1];
        for(int i=1;i<n+1;i++){
            parent[i]=i;
        }
        for(int i=0;i<n;i++){
            if(find(edges[i][0],parent)==find(edges[i][1],parent))
           return edges[i];
            union(edges[i][0],edges[i][1],parent);
        }
        return a;
    }
    int find(int x,int[] parent){
            if(parent[x]!=x)
            parent[x]=find(parent[x],parent);
            return parent[x];
        }
        void union(int x,int y,int[]parent){
            int u=find(x,parent);
            int v=find(y,parent);
            if(u!=v){
                parent[u]=v;
            }
        }
}
