class Solution {
    public String reverseOnlyLetters(String s) {
        int start=0;
        int end=s.length()-1;
        char[] ch=s.toCharArray();
        while(start<end){
            while(start<end && !Character.isLetter(ch[start])){
                start++;
            }
            while(start<end && !Character.isLetter(ch[end])){
                end--;
            }
            if(start<end){
                char temp=ch[start];
                ch[start++]=ch[end];
                ch[end--]=temp;
            }
        }
        return new String(ch);
    }
}