class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        char[] arr=num.toCharArray();
        int ind=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2!=0){
                ind=i;
                break;
            }
        }
        return ind==-1?"":num.substring(0,ind+1);
    }
}