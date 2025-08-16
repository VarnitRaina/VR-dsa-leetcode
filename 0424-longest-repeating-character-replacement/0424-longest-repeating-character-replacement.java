class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length(),res=0,max=0,l=0;
        int arr[]=new int[26];
        for(int r=0;r<n;r++){
            arr[s.charAt(r)-'A']++;
            if(arr[s.charAt(r)-'A']>max){
                max=arr[s.charAt(r)-'A'];
            }
            if((r-l+1-max)>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            if(r-l+1>res){
                res=r-l+1;
            }
        }
        return res;
    }
}