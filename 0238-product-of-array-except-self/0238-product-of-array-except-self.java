class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int leftProd=1,rightProd=1;
        left[0]=leftProd;
        right[n-1]=rightProd;
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*leftProd;
            leftProd=left[i];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=nums[i+1]*rightProd;
            rightProd=right[i];
        }
        for(int i=0;i<n;i++){
            left[i]=left[i]*right[i];
        }
        return left;
    }
}