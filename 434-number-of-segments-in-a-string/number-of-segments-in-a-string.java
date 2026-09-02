class Solution {
    public int countSegments(String s) {
        int count=0,j=0,space=0,length=s.length()-1;
        if(s.length()==0)
        return 0;
        while(s.length()>j&&s.charAt(j)==' '){
            j++;
        }
        while(length>=0&&s.charAt(length)==' ' ){
            length--;
        }
        if(length<0){
            return 0;
        }
        for(int i=j;i<=length;i++){
            if(s.charAt(i)==' '&&space<1){
                count++;
                space++;
            }else if(s.charAt(i)!=' '){
                space=0;
            }
        }
        return count+1;
    }
}