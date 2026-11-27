class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int low=0,high=s.length()-1;
        while(low<high){
            if((s.charAt(low)=='A'||s.charAt(low)=='E'||s.charAt(low)=='I'||s.charAt(low)=='O'||s.charAt(low)=='U'||s.charAt(low)=='a'||s.charAt(low)=='e'||s.charAt(low)=='i'||s.charAt(low)=='o'||s.charAt(low)=='u')&&(s.charAt(high)=='A'||s.charAt(high)=='E'||s.charAt(high)=='I'||s.charAt(high)=='O'||s.charAt(high)=='U'||s.charAt(high)=='a'||s.charAt(high)=='e'||s.charAt(high)=='i'||s.charAt(high)=='o'||s.charAt(high)=='u')){
                char ch=s.charAt(low);
                sb.deleteCharAt(low);
                sb.insert(low,s.charAt(high));
                sb.deleteCharAt(high);
                sb.insert(high,ch);
                low++;
                high--;
            }else if((s.charAt(low)=='A'||s.charAt(low)=='E'||s.charAt(low)=='I'||s.charAt(low)=='O'||s.charAt(low)=='U'||s.charAt(low)=='a'||s.charAt(low)=='e'||s.charAt(low)=='i'||s.charAt(low)=='o'||s.charAt(low)=='u')){
                high--;
            }else{
                low++;
            }
        }
        return sb.toString();
    }
}