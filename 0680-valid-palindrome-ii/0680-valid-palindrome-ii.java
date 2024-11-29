class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        if(n==0 || n==1 || n==2)return true;
        int start=0;
        int end=n-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return isPalindrome(s,start,end-1) || isPalindrome(s,start+1,end);
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}