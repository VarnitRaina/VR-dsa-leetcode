class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length,r=n-1,lSum=0,rSum=0;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
        }
        int maxSum=lSum;
        for(int i=k-1;i>=0;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[r--];
            maxSum=Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
}