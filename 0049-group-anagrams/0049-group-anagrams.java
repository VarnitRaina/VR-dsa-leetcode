class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedStr=new String(ch);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr,new ArrayList<String>());
            }
            map.get(sortedStr).add(str);
        }
        list.addAll(map.values());
        return list;
    }
}