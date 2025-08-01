class Solution {
    public int beautySum(String s) {
        int n=s.length(),sum=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        max=Math.max(max,freq[k]);
                        min=Math.min(min,freq[k]);
                    }
                }
                sum+=Math.abs(max-min);
            }
        }
        return sum;
    }
}