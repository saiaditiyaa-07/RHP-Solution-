import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][] ip = new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                ip[i][j]=sc.nextInt();
            }
        }
        int s=0;
        int tr=sc.nextInt();
        int tc=sc.nextInt();
        int[][] dir={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int i=0;i<8;i++){
            int rr=tr+dir[i][0];
            int rc=tc+dir[i][1];
            if(rr>=0 && rr<R && rc>=0 && rc<C){
                s+=ip[rr][rc];
            }
        }
        
        System.out.println(s);
    }
}
