class Solution {
    public boolean checkString(String s) {
        int correct=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                correct=-1;
            }
            if(s.charAt(i)=='a'&&correct==-1){
                return false;
            }
        }
        return true;
    }
}