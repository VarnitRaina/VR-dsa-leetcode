class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedstr=new String(charArray);
            if(!map.containsKey(sortedstr)){
                map.put(sortedstr,new ArrayList<String>());
            }
            map.get(sortedstr).add(str);
        }
        List<List<String>> l1=new ArrayList<>();
        l1.addAll(map.values());
        return l1;
    }
}