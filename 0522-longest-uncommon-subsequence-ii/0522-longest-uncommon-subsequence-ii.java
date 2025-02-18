class Solution {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs,(a,b)->b.length()-a.length());
        for(int i=0;i<strs.length;i++){
            boolean isSubseq=false;
            for(int j=0;j<strs.length;j++){
                if(i!=j && isSubsequence(strs[i],strs[j])){
                    isSubseq=true;
                    break;
                }
            }
            if(!isSubseq){
                return strs[i].length();
            }
        }
        return -1;
    }
    public boolean isSubsequence(String s1,String s2){
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s1.length();
    }
}