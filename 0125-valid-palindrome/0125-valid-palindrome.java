class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1)return true;
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.replaceAll("\\s","").toLowerCase();
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}