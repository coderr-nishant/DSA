class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int vowels=0,count=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getKey()=='a'||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u'){
                if(vowels<entry.getValue()){
                    vowels=entry.getValue();
                }
            }else{
                if(count<entry.getValue()){
                    count=entry.getValue();
                }
            }
        }
        return count+vowels;
    }
}