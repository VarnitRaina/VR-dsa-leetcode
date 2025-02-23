class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        int start=0,end=n-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<x){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        int left=start-1,right=start;
        while(k>0){
            if(left>=0 && right<n){
                if(Math.abs(arr[left]-x)<=Math.abs(arr[right]-x)){
                    list.add(arr[left--]);
                }
                else{
                    list.add(arr[right++]);
                }
            }
            else if(left>=0){
                list.add(arr[left--]);
            }
            else{
                list.add(arr[right++]);
            }
            k--;
        }
        Collections.sort(list);
        return list;
    }
}