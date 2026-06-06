import java.util.*;
class Main {
    private static int[] getmax(int[][] dp, int row, int col){
        int fmax=0;
        int smax=0;
        for(int i=0;i<row;i++){
            int curr = dp[i][col];
            if(curr>=fmax){
                smax=fmax;
                fmax=curr;
            }else if(curr>=smax){
                smax=curr;
            }
        }
        return new int[]{fmax,smax};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int og[][] = new int[r][c];
        int dp[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                og[i][j]=sc.nextInt();
                if(j==0){
                    dp[i][j]=og[i][j];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                int[] arr=getmax(dp,r,j-1);
                if(dp[i][j-1]!=arr[0]){
                    dp[i][j]=og[i][j]+arr[0];
                }else{
                    dp[i][j]=og[i][j]+arr[1];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int ans=0;
        for(int k=0;k<r;k++){
            ans=Math.max(ans,dp[k][c-1]);
        }
        System.out.println(ans);
    }
}
