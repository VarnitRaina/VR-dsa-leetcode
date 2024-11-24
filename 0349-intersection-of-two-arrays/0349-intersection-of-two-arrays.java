class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        List<Integer> l1=new ArrayList<>();
        for(int num1:nums1){
            set.add(num1);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                l1.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] res=new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            res[i]=l1.get(i);
        }
        return res;
    }
}