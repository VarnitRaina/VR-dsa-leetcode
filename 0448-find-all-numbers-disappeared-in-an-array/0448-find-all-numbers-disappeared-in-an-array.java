class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>h1=new HashSet<>();
        int n=nums.length;
        for(int num:nums){
            h1.add(num);
        }
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!h1.contains(i)){
                l1.add(i);
            }
        }
        return l1;
    }
}