class Solution {
    public int longestPalindrome(String s) {
        int n=s.length(),count=0;
        if(n==1)return 1;
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count+=2;
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}