class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary,(a,b)->{
            if(a.length()!=b.length()){
                return b.length()-a.length();
            }
            return a.compareTo(b);
        });
        for(String word:dictionary){
            if(isSubsequence(word,s)){
                return word;
            }
        }
        return "";
    }
    public boolean isSubsequence(String s1,String s2){
        int i=0,j=0;
        int n=s1.length(),m=s2.length();
        while(i<n && j<m){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s1.length();
    }
}