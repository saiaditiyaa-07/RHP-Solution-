class Solution {
    private static void dfs(char[][] mat,int R,int C,int row ,int col){
        mat[row][col]='0';
        final int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<4;i++){
            int tr=row+dir[i][0];
            int tc=col+dir[i][1];
            if(tr>=0 && tr<R && tc>=0 && tc<C && mat[tr][tc]=='1' ){
                dfs(mat,R,C,tr,tc);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int is=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    is++;
                    dfs(grid,grid.length,grid[0].length,i,j);
                }
            }
        }

        return is;
    }
}
