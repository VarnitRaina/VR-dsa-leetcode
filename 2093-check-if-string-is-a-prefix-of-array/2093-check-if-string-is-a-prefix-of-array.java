class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder res=new StringBuilder();
        for(String word:words){
            res.append(word);
            if(res.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
}