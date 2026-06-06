import java.util.*;
class Main {
    private static int[] fmax(int[][] dp,int row,int col){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int j=0;j<col;j++){
        int curr=dp[row-1][j];
        if(curr>=max1){
            max2=max1;
            max1=curr;
        }
        else if(curr>= max2){
            max2=curr;
        }
    }
    return new int[]{max1,max2};
        
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int dp[][]= new int[r][c];
        int og[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                og[i][j]=sc.nextInt();
                if(i==0){
                    dp[i][j]=og[i][j];
                }
            }
        }
        
        for(int i=1;i<r;i++){
           int[] fmax=fmax(dp,i,c);
            for(int j=0;j<c;j++){
                if(dp[i-1][j]!=fmax[0]){
                    dp[i][j]=og[i][j]+fmax[0];
                }else{
                    dp[i][j]=og[i][j]+fmax[1];
                }
            }
            
        }
        System.out.println("DP : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int ans=Integer.MIN_VALUE;
        for(int k=0;k<c;k++){
            ans=Math.max(ans,dp[r-1][k]);
        }
        
        System.out.println(ans);
    }
}
