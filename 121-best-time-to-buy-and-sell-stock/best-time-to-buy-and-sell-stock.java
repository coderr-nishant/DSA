class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit=0,currProfit=0;
      int cost=prices[0];
      for(int i=0;i<prices.length;i++){
        currProfit=prices[i]-cost;
        if(maxProfit<currProfit){
            maxProfit=currProfit;
        }
        if(cost>prices[i]){
            cost=prices[i];
        }
      }
      return maxProfit;
    }
}