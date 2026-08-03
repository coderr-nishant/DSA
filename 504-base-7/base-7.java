class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return Integer.toString(num);
        }
        boolean b=false;
        if(num<0){
            b=true;
            num=num*(-1);
        }
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            sb.append(num%7);
            num=num/7;
        }
        if(b){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}