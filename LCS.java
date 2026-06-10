class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int r=text1.length();
        int c=text2.length();
        
        int[][] dp =new int[r+1][c+1];
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(text1.charAt(i-1)!=text2.charAt(j-1)){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }else{
                    dp[i][j]=1+dp[i-1][j-1];
                }
            }
        }
       
        return dp[r][c];
        
    }
}
