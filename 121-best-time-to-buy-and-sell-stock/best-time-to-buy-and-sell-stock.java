class Solution {
    public int maxProfit(int[] prices) {
        int minprofit=Integer.MAX_VALUE;
         int profit=0;
         for(int price : prices){
           minprofit=Math.min(minprofit , price);
           profit=Math.max(profit,price-minprofit);
         }
         return profit;
    }
}