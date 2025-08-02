class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(!stack.isEmpty()){
                char curr=s.charAt(i);
                char last=stack.peek();
                if(isPair(last,curr)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
    public boolean isPair(char last,char curr){
        return ((last=='(' && curr==')')||(last=='{' && curr=='}') || (last=='[' && curr==']'));
    }
}