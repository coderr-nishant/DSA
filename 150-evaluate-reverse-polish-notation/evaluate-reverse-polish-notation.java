class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("*")&&!tokens[i].equals("/")){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int first=stack.pop();
                int second=stack.pop();
                if(tokens[i].equals("+")){
                    sum=first+second;
                }else if(tokens[i].equals("-")){
                    sum=second-first;
                }else if(tokens[i].equals("*")){
                    sum=second*first;
                }else{
                    sum=second/first;
                }
                stack.push(sum);
            }
        }
        return stack.pop();
    }
}