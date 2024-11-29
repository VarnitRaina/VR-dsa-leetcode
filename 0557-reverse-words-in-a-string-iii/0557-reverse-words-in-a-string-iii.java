class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            char[] word=arr[i].toCharArray();
            reverse(word,0,word.length-1);
            res.append(word);
            if(i<arr.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
    public static void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
}
