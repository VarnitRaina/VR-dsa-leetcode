class Solution {
    public int removePalindromeSub(String s) {
        int start=0;
        int end=s.length()-1;
        if(isPalindrome(s,start,end)){
            return 1;
        }
        else{
            return 2;
        }
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