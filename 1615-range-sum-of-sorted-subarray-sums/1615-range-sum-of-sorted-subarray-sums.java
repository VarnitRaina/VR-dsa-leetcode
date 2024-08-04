class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> l1=new ArrayList<>();
        int mod=1000000007;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                l1.add(sum);
            }
        }
        int sum=0;
        Collections.sort(l1);
        for(int k=left-1;k<right;k++){
            sum=(sum+l1.get(k))%mod;
        }
        return sum;
    }
}