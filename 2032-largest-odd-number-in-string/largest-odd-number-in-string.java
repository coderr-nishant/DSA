class Solution {
    public String largestOddNumber(String num) {
        while((num.length()-1)>=0){
            char ch=num.charAt(num.length()-1);
            int i=ch-'0';
            if(i%2!=0){
                return num.substring(0,num.length());
            }
            else{
               num= num.substring(0,num.length()-1);
            }
        }
        return "";
    }
}