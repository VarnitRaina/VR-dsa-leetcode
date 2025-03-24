class Solution {
    public int countDays(int days, int[][] meetings) {
        int n=meetings.length,ans=0;
        List<int[]> list=new ArrayList<>();
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int[] currentMeeting=meetings[0];
        list.add(currentMeeting);
        for(int i=1;i<n;i++){
            int currentEnd=currentMeeting[1];
            int nextStart=meetings[i][0];
            int nextEnd=meetings[i][1];
            if(currentEnd>=nextStart){
                currentMeeting[1]=Math.max(currentEnd,nextEnd);
            }
            else{
                currentMeeting=meetings[i];
                list.add(currentMeeting);
            }
        }
        int lastEnd=0;
        for(int [] meeting:list){
            int start=meeting[0];
            int end=meeting[1];
            ans+=start-lastEnd-1;
            lastEnd=end;
        }
        ans+=days-lastEnd;
        return ans;
    }
}