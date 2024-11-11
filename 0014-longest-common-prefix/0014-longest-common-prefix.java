class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i=0;
        while(i < str1.length() && str1.charAt(i) == str2.charAt(i)) {
			i++;
		}
        if (i==0){
            return "";
        }
        else{
            return str1.substring(0,i);
        }
    }
}