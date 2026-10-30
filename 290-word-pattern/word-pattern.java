class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        if(word.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        for(int i=0;i<word.length;i++){
            char ch=pattern.charAt(i);
            String words=word[i];
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(words)){
                    return false;
                }
            }
            if(map2.containsKey(words)){
                if(map2.get(words)!=(ch)){
                    return false;
                }
            }
            map1.put(ch,words);
            map2.put(words,ch);
        }
        return true;
    }
}