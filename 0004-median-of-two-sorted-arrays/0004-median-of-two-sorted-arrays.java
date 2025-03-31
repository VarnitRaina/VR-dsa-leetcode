class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        int n=nums1.length,m=nums2.length;
        double ans=0;
        for(int num:nums1){
            list.add(num);
        }
        for(int num:nums2){
            list.add(num);
        }
        Collections.sort(list);
        int l=0,r=list.size()-1;
        int mid=(l+r)/2;
        if(list.size()%2!=0){
            ans=list.get(mid);
        }
        else{
            ans=(double)(list.get(mid)+list.get(mid+1))/2;
        }
        return ans;
    }
}