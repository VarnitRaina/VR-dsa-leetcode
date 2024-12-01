class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder res=new StringBuilder("");
        for(int i=0;i<words.length;i++){
            char[] word=words[i].toCharArray();
            reverse(word,0,word.length-1);
            res.append(word);
            if(i<words.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
    public void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
}