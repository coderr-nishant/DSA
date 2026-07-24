class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        String s=strs[0];
        String sb="";
        if(s.equals(""))
        return sb;
        while(i<s.length()&&s.charAt(i)!=' '){
            int count=0;
            for(int j=0;j<strs.length;j++){
                if(i < s.length() && i < strs[j].length() &&s.charAt(i)==(strs[j]).charAt(i))
                count++;
            }
            if(count==strs.length)
            sb=sb+s.charAt(i);
            else
            break;
            i++;
            
        }
        return sb;
    }
}