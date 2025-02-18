class Solution {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs,(a,b)->b.length()-a.length());
        int n=strs.length;
        for(int i=0;i<n;i++){
            boolean subseq=false;
            for(int j=0;j<n;j++){
                if(i!=j && isSubsequence(strs[i],strs[j])){
                    subseq=true;
                    break;
                }
            }
            if(!subseq){
                return strs[i].length();
            }
        }
        return -1;
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
        return i==n;
    }
}