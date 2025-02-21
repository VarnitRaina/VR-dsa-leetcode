class Solution {
    public boolean judgeSquareSum(int c) {
        long s=0,e=(long)Math.sqrt(c);
        while(s<=e){
            long ans=s*s+e*e;
            if(ans==c){
                return true;
            }
            else if(ans<c){
                s++;
            }
            else{
                e--;
            }
        }
        return false;
    }
}