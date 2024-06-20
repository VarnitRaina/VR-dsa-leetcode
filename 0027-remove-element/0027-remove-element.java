class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList <Integer> l1=new ArrayList<>();
        int k=0;
        int i=0;
        while(i<nums.length){
            l1.add(nums[i++]);
        }
        i=0;
        while(i<l1.size()){
            if (l1.get(i)!=val){
                k++;
                i++;
            }
            else{
            l1.remove(i);
            }
        }
        for (i=0;i<k;i++){
            nums[i]=l1.get(i);
        }
        return k;
    }
}