class Solution {
    public int minimumChairs(String s) {
        int count=0,largest=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                count++;
            }else{
                largest=Math.max(largest,count);
                count=count-1;
            }
        }
        largest=Math.max(largest,count);
        return largest;
    }
}