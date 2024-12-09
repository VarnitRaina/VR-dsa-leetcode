class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=name.length();
        int m=typed.length();
        int i=0;
        int j=0;
        int prev=0;
        while(i<n && j<m){
            if(name.charAt(i)==typed.charAt(j)){
                prev=i;
                i++;
                j++;
            }
            else if(name.charAt(prev)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        while(j<m){
            if(name.charAt(prev)!=typed.charAt(j)){
                return false;
            }
            j++;
        }
        if(i<n && j>=m){
            return false;
        }
        return true;
    }
}