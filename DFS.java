class Solution {
    private int dfs(int[][] mat,int R,int C,int row,int col,int[][] res){
        if(res[row][col]!=0){
            return res[row][col];
        }
        int adjm=0;
        int[][] dir={{0,-1},{0,1},{-1,0},{1,0}};
        for(int i=0;i<4;i++){
            int tr=row + dir[i][0];
            int tc = col+dir[i][1];
            if(tr>=0 && tr<R && tc>=0 && tc<C && mat[tr][tc]>mat[row][col]){
                adjm=Math.max(adjm,dfs(mat,R,C,tr,tc,res));
            }
        }
        res[row][col] = 1 + adjm;
        return res[row][col];
         

    }
    public int longestIncreasingPath(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        int[][] res= new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                res[i][j]=dfs(matrix,R,C,i,j,res);

            }
        }
        int mm=0;
         for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                mm=Math.max(mm,res[i][j]);
                
            }
        }
       return mm; 
    }
}
