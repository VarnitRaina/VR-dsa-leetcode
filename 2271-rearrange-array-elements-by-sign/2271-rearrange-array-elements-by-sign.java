class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int num:nums){
            if(num>=0){
                l1.add(num);
            }
            else{
                l2.add(num);
            }
        }
        int pos=0,neg=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=l1.get(pos++);
            }
            else{
                nums[i]=l2.get(neg++);
            }
        }
        return nums;
    }
}