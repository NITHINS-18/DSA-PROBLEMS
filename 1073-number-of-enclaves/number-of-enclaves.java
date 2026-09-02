class Solution {
    void dfs(int[][]grid,int i,int j){
        grid[i][j]=0;
        int [][]dir={{-1,0},{0,-1},{1,0},{0,1}};
        for(int k=0;k<4;k++){
            int r=i+dir[k][0];
            int c=j+dir[k][1];
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]==1){
                dfs(grid,r,c);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int c=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || j==0 || i==m-1 || j==n-1) && (grid[i][j]==1)){
                       dfs(grid,i,j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                   c++;
                }
            }
        }
        return c;
    }
}