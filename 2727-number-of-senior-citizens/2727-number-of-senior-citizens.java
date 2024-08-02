class Solution {
    public int countSeniors(String[] details) {
        int age;
        int count=0;
        for(String str:details){
                age=Character.getNumericValue(str.charAt(11))*10+Character.getNumericValue(str.charAt(12));
                if(age>60){
                    count++;
                }
        }
        return count;
    }
}