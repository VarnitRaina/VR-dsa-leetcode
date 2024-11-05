class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> l1=new ArrayList<>();
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                l1.add(nums1[i++]);
            }
            else{
                l1.add(nums2[j++]);
            }
        }
        while(i<m){
            l1.add(nums1[i++]);
        }
        while(j<n){
            l1.add(nums2[j++]);
        }
        for(i=0;i<m+n;i++){
            nums1[i]=l1.get(i);
        }
    }
}