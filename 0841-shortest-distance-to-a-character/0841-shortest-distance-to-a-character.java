class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int index=Integer.MIN_VALUE/2;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                index=i;
            }
            arr[i]=i-index;
        }
        index=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                index=i;
            }
            arr[i]=Math.min(arr[i],index-i);
        }
        return arr;
    }
}