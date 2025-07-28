class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix[0].length;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    zeroRow(matrix,i,m);
                    zeroCol(matrix,j,n);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-99){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void zeroRow(int nums[][],int a,int b){
        for(int k=0;k<b;k++){
            if(nums[a][k]!=0)
                nums[a][k]=-99;
        }
    }
    public void zeroCol(int nums[][],int a,int b){
        for(int k=0;k<b;k++){
            if(nums[k][a]!=0)
                nums[k][a]=-99;
        }
    }
}