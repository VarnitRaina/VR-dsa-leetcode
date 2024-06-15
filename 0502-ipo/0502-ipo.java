import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];

        // Pair up capital and profit, and sort by capital
        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }

        // Sort projects based on the capital required
        Arrays.sort(projects, Comparator.comparingInt(a -> a[0]));

        // Max-heap to store the available profits
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int index = 0;

        // Iterate k times to select k projects
        for (int i = 0; i < k; i++) {
            // Add all the projects we can afford with current capital w
            while (index < n && projects[index][0] <= w) {
                maxHeap.add(projects[index][1]);
                index++;
            }

            // If there are no available projects we can afford, break the loop
            if (maxHeap.isEmpty()) {
                break;
            }

            // Select the most profitable project
            w += maxHeap.poll();
        }

        return w;
    }
}
