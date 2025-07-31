class Solution {
    public String largestOddNumber(String num) {
        int ind=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                ind=i;
                break;
            }
        }
        return ind==-1?"":num.substring(0,ind+1);
    }
}