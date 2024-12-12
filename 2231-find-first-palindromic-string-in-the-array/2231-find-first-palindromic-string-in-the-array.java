class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            char[] arr=word.toCharArray();
            if(isPalindrome(arr,0,arr.length-1)){
                return new String(arr);
            }
        }
        return "";
    }
    public boolean isPalindrome(char[]arr,int start,int end){
        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}