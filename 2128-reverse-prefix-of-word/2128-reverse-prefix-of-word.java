class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
        int j=0;
        char[] arr=word.toCharArray();
        while(j<arr.length){
            if(arr[j]==ch){
                reverse(arr,i,j);
                break;
            }
            j++;
        }
        return new String(arr);
    }
    public void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
}