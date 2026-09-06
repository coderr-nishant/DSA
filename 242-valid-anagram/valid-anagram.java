class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String valS = new String(sArr);
        String valt = new String(tArr);
        return valS.equals(valt);
    }
}