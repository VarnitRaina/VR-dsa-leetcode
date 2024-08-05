class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> al=Arrays.asList(arr);
        ArrayList<String> l1=new ArrayList<>(al);
        ArrayList<String> l2=new ArrayList<>();
        for(int i=0;i<l1.size();i++){
            boolean isDistinct=true;
            for(int j=0;j<l1.size();j++){
                if(i!=j && l1.get(i).equals(l1.get(j))){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct){
                l2.add(l1.get(i));
            }
        }
        
        if((k-1)<l2.size()){
            return l2.get(k-1);
        }
        else{
            return "";
        }
    }
}