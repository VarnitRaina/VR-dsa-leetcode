class Solution {
    public String reverseParentheses(String s) {
        StringBuilder result=new StringBuilder(s);
        int si=result.lastIndexOf("(");
        int ei=result.indexOf(")",si);
        while(si!=-1){
            StringBuilder sb=new StringBuilder(result.substring(si+1,ei));
            sb.reverse();
            result.replace(si,ei+1,sb.toString());
            si=result.lastIndexOf("(");
            ei=result.indexOf(")",si);
        }
        return result.toString();
    }
}