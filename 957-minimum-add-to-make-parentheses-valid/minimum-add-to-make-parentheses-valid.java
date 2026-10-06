class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack1=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack1.push(s.charAt(i));
            }else if(s.charAt(i)==')'&&!stack1.isEmpty()){
                stack1.pop();
            }else {
                count++;
            }
        }
        return count+stack1.size();
    }
}