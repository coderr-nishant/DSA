class Solution {
    public int buyChoco(int[] prices, int money) {
        int firstMin=prices[0];
        for(int i=1;i<prices.length;i++){
            if(firstMin>prices[i]){
                firstMin=prices[i];
            }
        }
        for(int i=0;i<prices.length;i++){
            if(firstMin==prices[i]){
                prices[i]=101;
                break;
            }
        }
        int secondMin=prices[0];
        for(int i=1;i<prices.length;i++){
            if(secondMin>prices[i]){
                secondMin=prices[i];
            }
        }
        if((firstMin+secondMin)>money)
        return money;
        return money-(firstMin+secondMin);
    }
}