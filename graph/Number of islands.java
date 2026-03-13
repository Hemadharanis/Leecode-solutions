class Solution {
    int islands;
    public int numIslands(char[][] grid) {
      int[][] dir={{1,0},{0,1},{-1,0},{0,-1}}; 
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){ 
            if(grid[i][j]=='1'){
            islands++;
      island(grid,i,j,dir);}}}
      return islands;
    }
    void island(char[][] grid,int r,int c,int[][] dir){
        if(r>=grid.length||c>=grid[0].length||r<0||c<0)
        return ;
        if(grid[r][c]!='1'){
            return ;
        }
        grid[r][c]='2';
        for(int i=0;i<4;i++){
            island(grid,r+dir[i][0],c+dir[i][1],dir);
        }
       

         
    }
}
