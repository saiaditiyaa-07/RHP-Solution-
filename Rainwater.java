class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int[] lmax=new int[len];
        int[] rmax=new int[len];
        int max1=height[len-1];
        int max=height[0];
        for(int i=0;i<len;i++){
            lmax[i]=Math.max(max,height[i]);
            max=lmax[i];
        }
        for(int i=len-1;i>=0;i--){
            rmax[i]=Math.max(max1,height[i]);
            max1=rmax[i];
        }
        int s=0;
        for(int i=0;i<len;i++){
            s+=Math.min(lmax[i],rmax[i]) - height[i];

        }
        return s;
    }
}
