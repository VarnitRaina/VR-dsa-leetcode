class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        Arrays.sort(strs);
        int i=0,j=0,n=strs.length;
        int l=strs[0].length(),m=strs[n-1].length();
        while(i<l && j<m){
            if(strs[0].charAt(i)==strs[n-1].charAt(j)){
                res+=strs[0].charAt(i);
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return res;
    }
}