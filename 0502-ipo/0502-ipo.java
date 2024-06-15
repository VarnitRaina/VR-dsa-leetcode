
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        
        // List to store projects based on their capital requirements
        List<int[]> projects = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            projects.add(new int[]{capital[i], profits[i]});
        }
        
        // Sort projects by their capital requirements (ascending order)
        Collections.sort(projects, (a, b) -> a[0] - b[0]);
        
        // Max heap to store profits of available projects (descending order)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        int idx = 0;
        
        while (k > 0) {
            // Add all projects that we can currently start with the available capital 'w'
            while (idx < n && projects.get(idx)[0] <= w) {
                maxHeap.offer(projects.get(idx)[1]);
                idx++;
            }
            
            // If no projects can be undertaken (maxHeap is empty), break
            if (maxHeap.isEmpty()) {
                break;
            }
            
            // Select the project with maximum profit that we can afford
            w += maxHeap.poll();
            
            // Decrement the count of projects we can still select
            k--;
        }
        
        return w;
    }
}
