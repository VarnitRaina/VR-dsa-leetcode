class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int arr[]:image){
            int start=0;
            int end=arr.length-1;
            reverse(arr,start,end);
            for(int i=0;i<arr.length;i++){
                if(arr[i]==1){
                    arr[i]=0;
                }
                else{
                    arr[i]=1;
                }
            }
        }
        return image;
    }
    public void reverse(int[] arr, int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
}