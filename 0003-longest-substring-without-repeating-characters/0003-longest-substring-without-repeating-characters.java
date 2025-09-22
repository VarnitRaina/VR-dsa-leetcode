class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character> set=new HashSet<>();
        int l=0,max=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            max=Math.max(r-l+1,max);
        }
        return max;
    }
}