class Solution {
    boolean uppercase(String s){
        for(int i=1;i<s.length()-1;i++){
            if(!(Character.isUpperCase(s.charAt(i))))
            return false;
        }
        return true;
    }
    boolean middlecase(String s){
        for(int i=1;i<s.length()-1;i++){
            if(!(Character.isLowerCase(s.charAt(i))))
            return false;
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        int count=0;
        boolean b=false;
        if(Character.isUpperCase(word.charAt(0))&&Character.isUpperCase(word.charAt(word.length()-1))){
            return uppercase(word);
        }else if(Character.isUpperCase(word.charAt(0))&&Character.isLowerCase(word.charAt(word.length()-1))){
            return middlecase(word);
        }else if(Character.isLowerCase(word.charAt(0))&&Character.isLowerCase(word.charAt(word.length()-1))){
            return middlecase(word);
        }
       return false;
    }
}