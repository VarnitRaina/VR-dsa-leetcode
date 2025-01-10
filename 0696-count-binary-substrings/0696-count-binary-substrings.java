class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0,curr=1,ans=0;
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ans+=Math.min(curr,prev);
                prev=curr;
                curr=1;
            }   
            else{
                curr++;
            }
        }
        ans+=Math.min(curr,prev);
        return ans;
    }
}