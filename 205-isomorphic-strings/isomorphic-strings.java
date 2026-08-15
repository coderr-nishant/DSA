class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        int count1=0,count2=0;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(!map1.containsKey(ch1)){
                if(map1.containsValue(t.charAt(i))){
                    return false;
                }
                map1.put(ch1,t.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=sb.charAt(i);
            sb.setCharAt(i,map1.get(ch));
        }
        if(sb.toString().equals(t))
        return true;
        return false;
    }
}