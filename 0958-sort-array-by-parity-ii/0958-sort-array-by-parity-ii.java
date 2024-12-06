class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd=1;
        int n=nums.length;
        while(even<n && odd<n){
            if(nums[even]%2!=0){
                if(nums[odd]%2==0){
                    swap(nums,even,odd);
                }
                odd+=2;
            }
            else{
                even+=2;
            }
        }
        return nums;
    }
    public void swap(int[] arr,int prev,int curr){
        int temp=arr[prev];
        arr[prev++]=arr[curr];
        arr[curr--]=temp;
    }
}