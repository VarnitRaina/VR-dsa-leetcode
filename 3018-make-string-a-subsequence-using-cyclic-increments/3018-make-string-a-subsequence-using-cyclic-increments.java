class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        Map<Character,Character> map=new HashMap<>();
        map.put('a','z');
        for(char c='b';c<='z';c++){
            map.put(c,(char)(c-1));
        }
        int p1=str1.length()-1;
        int p2=str2.length()-1;
        while(p1>=0 && p2>=0){
            if(str1.charAt(p1)==str2.charAt(p2)){
                p1--;
                p2--;
            }
            else{
                char val=map.get(str2.charAt(p2));
                if(str1.charAt(p1)==val){
                    p1--;
                    p2--;
                }
                else{
                    p1--;
                }
            }
        }
        return p2<0;
    }
}