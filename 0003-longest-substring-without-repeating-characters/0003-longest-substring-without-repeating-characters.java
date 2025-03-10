class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,max=0;
        Set<Character> set=new HashSet<>();
        int n=s.length();
        for(int r=0;r<n;r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}