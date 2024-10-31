class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int n=nums.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                l1.add(nums[i]);
            }
            else{
                l2.add(nums[i]);
            }
        }
        int posIndex = 0, negIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = l1.get(posIndex++);
            } else {
                result[i] = l2.get(negIndex++);
            }
        }
        return result;
    }
}