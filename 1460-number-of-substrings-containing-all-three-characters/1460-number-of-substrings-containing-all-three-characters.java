class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length(),count=0;
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=-1;
        }
        for(int r=0;r<n;r++){
            arr[s.charAt(r)-'a']=r;
            count += (1 + Math.min(arr[0], Math.min(arr[1], arr[2])));
        }
        return count;
    }
}