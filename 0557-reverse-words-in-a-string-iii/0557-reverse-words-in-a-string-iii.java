class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String rev=" ";
            char[] word=arr[i].toCharArray();
            reverse(word,0,word.length-1);
            res.append(new String(word));
            if(i<arr.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
    public String reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        return new String(arr);
    }
}