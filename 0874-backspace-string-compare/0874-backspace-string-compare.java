class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n=s.length();
        int m=t.length();
        Stack<Character> stack1=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='#'){   
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }
            else{
                stack1.push(s.charAt(i));
            }
        }
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<m;i++){
            if(t.charAt(i)=='#'){   
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
            else{
                stack2.push(t.charAt(i));
            }
        }
        if (stack1.size() != stack2.size()) {
            return false;
        }
        while(!stack1.isEmpty()){
            if(stack1.pop()!=stack2.pop()){
                return false;
            }
        }
        return true;
    }
}