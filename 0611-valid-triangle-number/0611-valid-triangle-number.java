class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        for(int i=2;i<n;i++){
            count+=binary(i,nums);
        }
        return count;
    }
    public int binary(int i,int arr[]){
        int n=arr.length;
        int ans=0,s=0,e=i-1;
        while(s<e){
            if(arr[s]+arr[e]>arr[i]){
                ans+=e-s;
                e--;
            }
            else{
                s++;
            }
        }
        return ans;
    }
}