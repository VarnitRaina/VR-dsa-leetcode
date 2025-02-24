class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            if(minHeap.size()<k){
                minHeap.offer(new int[]{freq,num});
            }else{
                minHeap.offer(new int[]{freq,num});
                minHeap.poll();
            }
        }
        int[] result=new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i++]=minHeap.poll()[1];
        }
        return result;
    }
}