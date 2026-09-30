class Solution {
    public String convertToTitle(int columnNumber) {
        String arr[]=new String[27];
        for(int i=1;i<arr.length;i++){
            arr[i]= String.valueOf((char)(i+64));
        }
        String str="";
        while(columnNumber>0){
            columnNumber--;
            int sum= columnNumber%26;
            str=arr[sum+1]+str;
            columnNumber=columnNumber/26;
        }
        
        return str;
    }
}