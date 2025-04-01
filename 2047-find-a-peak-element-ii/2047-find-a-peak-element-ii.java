class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length,m=mat[0].length,max=Integer.MIN_VALUE,ind1=0,ind2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                    ind1=i;
                    ind2=j;
                }
            }
        }
        return new int[]{ind1,ind2};
    }
}