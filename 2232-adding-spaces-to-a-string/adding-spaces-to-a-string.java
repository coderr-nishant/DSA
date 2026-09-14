class Solution {
    public String addSpaces(String s, int[] spaces) {
        int j=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<spaces.length;i++){
            str.append((s.substring(j,spaces[i]))).append(" ");
            j=spaces[i];
        }
        str.append(s.substring(j,s.length()));
        return str.toString();
    }
}