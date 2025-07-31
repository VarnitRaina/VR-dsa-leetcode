class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0,n=strs.length;
        Arrays.sort(strs);
        while(i<strs[0].length() && strs[0].charAt(i)==strs[n-1].charAt(i)){
            i++;
        }
        return i==0?"":strs[0].substring(0,i);
    }
}