class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
    public String buildString(String str){
        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        for(char ch:stack){
            res.append(ch);
        }
        return res.toString();
    }
}