class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        int n=words.length-1;
        reverse(words,0,n);
        String res=String.join(" ",words);
        return res;
    }
    public void reverse(String arr[],int start,int end){
        while(start<end){
            String temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
}