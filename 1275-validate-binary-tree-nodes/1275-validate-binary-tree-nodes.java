class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] inEdges = new int[n];
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                inEdges[leftChild[i]]++;
            }
            if (rightChild[i] != -1) {
                inEdges[rightChild[i]]++;
            }
        }
        int root = -1;
        int rootCount = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (inEdges[i] == 0) {
                rootCount++;
                root = i;
            }
            if (inEdges[i] > 1)
                flag = false;
        }
        if (rootCount != 1)
            return false;
        if (flag == false)
            return false;

        boolean[] visited = new boolean[n];
        if (!dfs(root, leftChild, rightChild, visited)) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int node, int[] leftChild, int[] rightChild, boolean[] visited) {

        visited[node] = true;
        if (leftChild[node] != -1) {
            if (!dfs(leftChild[node], leftChild, rightChild, visited)) {
                return false;
            }
        }
        if (rightChild[node] != -1) {
            if (!dfs(rightChild[node], leftChild, rightChild, visited)) {
                return false;
            }
        }
        return true;
    }
}