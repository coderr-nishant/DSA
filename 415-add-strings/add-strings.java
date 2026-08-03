class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        String sum="";
         StringBuilder sb=new StringBuilder(sum);
        while(i>=0&&j>=0){
            int c=num1.charAt(i)-'0';
            int d=num2.charAt(j)-'0';
            int total=c+d+carry;
            sb.append((total)%10);
            carry=(total)/10;
            i--;
            j--;
        }
        while(i>=0){
            int c=num1.charAt(i)-'0';
           int total=c+carry;
            sb.append((total)%10);
            carry=(total)/10;
            i--;
        }
        while(j>=0){
            int d=num2.charAt(j)-'0';
           int total=d+carry;
            sb.append((total)%10);
            carry=(total)/10;
            j--;
        }
        if(carry>0){
            sb.append(carry);
        }
       
        return sb.reverse().toString();
    }
}