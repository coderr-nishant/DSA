class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        int i=0,j=0;
        while(j<s1.length()){
            if(s1.charAt(j)==' '){
                map.put(s1.substring(i,j),map.getOrDefault(s1.substring(i,j),0)+1);
                i=j+1;
            }
            j++;
        }
        map.put(s1.substring(i),map.getOrDefault(s1.substring(i),0)+1);
        int k=0,l=0;
        while(l<s2.length()){
            if(s2.charAt(l)==' '){
                map.put(s2.substring(k,l),map.getOrDefault(s2.substring(k,l),0)+1);
                k=l+1;
            }
            l++;
        }
        map.put(s2.substring(k),map.getOrDefault(s2.substring(k),0)+1);
        List<String> list=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
}