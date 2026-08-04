class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0,num=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int frequency=entry.getValue();
            if(frequency%2==0){
                count=count+frequency;
            }
            if(frequency%2!=0){
                count=count+(frequency/2)*2;
                num=1;
            }
        }
        count=count+num;
        return count;
    }
}