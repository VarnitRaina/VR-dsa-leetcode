class Solution {
    public void duplicateZeros(int[] arr) {
        int start=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]==0){
                start=i;
                int end=arr.length-1;
                while(end>start){
                    arr[end]=arr[end-1];
                    end--;
                }
                i+=2;
            }
            else{
                i++;
            }
        }
    }
}