class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        Queue<int[]> q=new LinkedList<>();
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,1},{1,-1},{-1,-1}};
        if(grid[0][0]==1)
        return -1;
        q.add(new int[]{0,0,1});
        while(!q.isEmpty()){
            int[] a=q.poll();
            int r=a[0];
            int c=a[1];
            int dist=a[2];
        if(r==n-1 && c==n-1)
        return dist;
        for(int[] d:dir){
            int nr=r+d[0];
            int nc=c+d[1];

            if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==0){
                q.add(new int[]{nr,nc,dist+1});
                grid[nr][nc]=1;
            }
        }


        }
return -1;
    }
}
