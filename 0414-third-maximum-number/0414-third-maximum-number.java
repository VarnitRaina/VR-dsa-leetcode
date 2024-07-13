class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> h1=new HashSet<>();
        for (int num : nums) {
            h1.add(num);
        }
        ArrayList<Integer> l1 = new ArrayList<>(h1);
        Collections.sort(l1);
        int n=l1.size();
        if (n < 3) {
            return l1.get(n - 1); 
        }
        
        return l1.get(n - 3); 
}}