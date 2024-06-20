class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set=new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board[0].length; j++) {
                char cur=board[i][j];
                if(cur!='.'){
                    if(!set.add("row"+i+cur) || !set.add("col"+j+cur) || !set.add("grid"+cur+i/3+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
