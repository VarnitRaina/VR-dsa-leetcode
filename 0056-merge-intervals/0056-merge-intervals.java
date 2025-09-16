class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int currentInterval[]=intervals[0];
        list.add(currentInterval);
        for(int i=1;i<n;i++){
            int currentEnd=currentInterval[1];
            int nextStart=intervals[i][0];
            int nextEnd=intervals[i][1];
            if(currentEnd>=nextStart){
                currentInterval[1]=Math.max(currentEnd,nextEnd);
            }
            else{
                currentInterval=intervals[i];
                list.add(currentInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}