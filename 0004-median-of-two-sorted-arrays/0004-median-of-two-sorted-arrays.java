class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        for(int i:nums1){
            l1.add(i);
        }
        for(int i:nums2){
            l1.add(i);
        }
        Collections.sort(l1);
        if(l1.size()%2==0){
            return (l1.get(l1.size()/2)+l1.get(l1.size()/2-1))/2.0;
        }
        else{
            return l1.get(l1.size()/2);
        }
    }
}