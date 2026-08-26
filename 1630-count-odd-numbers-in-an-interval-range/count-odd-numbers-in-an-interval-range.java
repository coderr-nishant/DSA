class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low%2!=0){
            while(low<=high){
                count++;
                low=low+2;
            }
        }else{
            low=low+1;
            while(low<=high){
                count++;
                low=low+2;
            }
        }
        return count;
    }
}