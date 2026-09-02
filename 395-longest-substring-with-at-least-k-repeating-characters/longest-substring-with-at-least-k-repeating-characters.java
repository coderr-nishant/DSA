class Solution {
    public int longestSubstring(String s, int k) {
        int count=0,max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))<k){
                String left=s.substring(0,i);
                String right=s.substring(i+1);
                return Math.max(longestSubstring(left,k),longestSubstring(right,k));
            }
        }
        return s.length();
    }
}