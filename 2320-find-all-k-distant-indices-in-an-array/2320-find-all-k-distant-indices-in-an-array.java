class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> l1=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j]==key && Math.abs(i-j)<=k){
                    l1.add(i);
                    break;
                }
            }
        }
        return l1;
    }
}