class Solution {
    public String longestPalindrome(String s) {
        int n=s.length(),start=0,end=0;
        for(int i=0;i<n;i++){
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);
            int max=Math.max(len1,len2);
            if(max>end-start){
                start=i-(max-1)/2;
                end=i+max/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int expandAroundCenter(String s,int l,int r){
        int n=s.length();
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}