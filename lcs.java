
import java.util.*;
class Main {
     private static int lcs(String text1, String text2) {
        int r=text1.length();
        int c=text2.length();
        int mm=0;
        int[][] dp =new int[r+1][c+1];
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                if(i==0 || j==0 || text1.charAt(i-1)!=text2.charAt(j-1)){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=1+dp[i-1][j-1];
                    mm=Math.max(mm,dp[i][j]);
                }
            }
        }
       
        return mm;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int aaa=lcs(a,b);
        System.out.println(aaa);
    }
}
