class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        int sIndex=-1,count=0,l=0,n=s.length(),m=t.length(),min=Integer.MAX_VALUE;
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    count++;
                }
                map.put(c,map.get(c)-1);
            }
            while(count==m){
                if(r-l+1<min){
                    min=r-l+1;
                    sIndex=l;
                }
                char lc=s.charAt(l);
                if(map.containsKey(lc)){
                    if(map.get(lc)==0){
                        count--;
                    }
                    map.put(lc,map.get(lc)+1);
                }
                l++;
            }
        }
        return sIndex==-1?"":s.substring(sIndex,sIndex+min);
    }
}