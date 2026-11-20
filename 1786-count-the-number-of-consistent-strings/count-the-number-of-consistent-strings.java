class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean p=true;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int j=0;
            while(j<word.length()){
                if(!set.contains(word.charAt(j))){
                    p=false;
                    break;
                }
                j++;
            }
            if(p){
                count++;
            }
            p=true;
        }
        return count;
    }
}