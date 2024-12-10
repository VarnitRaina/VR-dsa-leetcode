class Solution {
    public int removePalindromeSub(String s) {
        int count=0;
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(isPalindrome(s,start,end)){
                count=1;
                break;
            }
            else{
                count=2;
                break;
            }
            
        }
        return count;
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