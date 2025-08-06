class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int n=s.length(),l=0,len=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}