class Solution {
    public int maxPower(String s) {
        int len=s.length();
        int i=0,j=1;
        int count=1,largest=1;
        while(j<len){
            if(s.charAt(i)==s.charAt(j)){
                count=count+1;
            }else{
                largest=Math.max(largest,count);
                count=1;
                i=j;
            }
            j++;
        }
        largest=Math.max(largest,count);
        return largest;
    }
}