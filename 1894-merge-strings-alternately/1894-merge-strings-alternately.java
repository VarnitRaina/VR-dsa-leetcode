class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res=new StringBuilder();
        int i=0;
        int j=0;
        int n=word1.length();
        int m=word2.length();
        while(i<n && j<m){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        while(i<n){
            res.append(word1.charAt(i++));
        }
        while(j<m){
            res.append(word2.charAt(j++));
        }
        return res.toString();
    }
}