class Solution {
    public int maxProfit(int k, int[] prices) {
        int[]b=new int[k+1];
        int[]s=new int[k+1];
        Arrays.fill(b,Integer.MIN_VALUE);
        for(int p : prices){
            for(int i=1;i<=k;i++){
                b[i]=Math.max(b[i],s[i-1]-p);
                s[i]=Math.max(s[i],b[i]+p);
            }
        }
        return s[k];
    }
}