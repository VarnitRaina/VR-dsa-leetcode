class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix[0].length;
        int n=matrix.length;
        int cols[]=new int[m];
        int rows[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i]==1 || cols[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}