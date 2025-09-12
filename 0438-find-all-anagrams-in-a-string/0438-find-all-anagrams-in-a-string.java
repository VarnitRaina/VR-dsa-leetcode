class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int[] pcount=new int[26];
        int[] scount=new int[26];
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            scount[s.charAt(r)-'a']++;
            if(r>=p.length()){
                scount[s.charAt(r-p.length())-'a']--;
            }
            if(Arrays.equals(pcount,scount)){
                res.add(r-p.length()+1);
            }
            
        }
        return res;
    }
}