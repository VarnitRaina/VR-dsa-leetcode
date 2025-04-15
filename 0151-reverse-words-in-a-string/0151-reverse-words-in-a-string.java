class Solution {
    public String reverseWords(String s) {
        String [] words=s.trim().split("\\s+");
        reverse(words,0,words.length-1);
        String ans=String.join(" ",words);
        return ans;
    }
    public void reverse(String[] arr,int start,int end){
        while(start<end){
            String temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
}