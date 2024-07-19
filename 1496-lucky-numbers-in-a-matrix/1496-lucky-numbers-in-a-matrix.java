class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> l1=new ArrayList<>();

        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int minCol=-1;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minCol=j;
                }
            }
            
            boolean maxCol=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][minCol]>min){
                    maxCol=false;
                    break;
                }
            }

            if(maxCol){
                l1.add(min);
            }
        }
        return l1;
    }
}