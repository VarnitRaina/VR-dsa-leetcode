class Solution {
    public int passThePillow(int n, int time) {
        int i=1;
        boolean forward=true;
        for(int t=0;t<time;t++){
            if(forward){
                i++;
                if(i>n){
                    i=n-1;
                    forward=false;
                }
            }
            else{
                i--;
                if(i<1){
                    i=2;
                    forward=true;
                }
            }
        }
        return i;
    }
}