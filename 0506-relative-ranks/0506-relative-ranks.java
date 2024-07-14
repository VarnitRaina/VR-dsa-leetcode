class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            l1.add(score[i]);
        }
        Collections.sort(l1,Collections.reverseOrder());
        String[] result=new String[score.length];
        for (int i=0;i<score.length;i++){
            int currentscore=score[i];
            int rank=l1.indexOf(currentscore)+1;
            String rankString;
            if (rank==1){
                rankString="Gold Medal";
            }
            else if(rank==2){
                rankString="Silver Medal";
            }
            else if(rank==3){
                rankString="Bronze Medal";
            }
            else{
                rankString=String.valueOf(rank);
            }
            result[i]=rankString;
        }
            return result;
        }
    }
