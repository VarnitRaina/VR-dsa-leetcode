class Solution {
    public int minimumPushes(String word) {
        int[]mp=new int[26];
        for(char ch:word.toCharArray()){
            mp[ch-'a']++;
        }
        List<Integer> frequencies=new ArrayList<>();
        for(int freq:mp){
            frequencies.add(freq);
        }
        frequencies.sort(Collections.reverseOrder());
        int result=0;
        for(int i=0;i<26;i++){
            int freq=frequencies.get(i);
            int press=i/8+1;
            result+=freq*press;
        }
        return result;
    }
}