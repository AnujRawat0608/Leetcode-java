class Solution {

    public boolean canReach(int[] arr, int start) {

        boolean[] visited = new boolean[arr.length];

        return dfs(arr, start, visited);
    }

    public boolean dfs(int[] arr, int idx, boolean[] visited) {

        // Out of bounds
        if (idx < 0 || idx >= arr.length) {
            return false;
        }

        // Already visited
        if (visited[idx]) {
            return false;
        }

        // Found zero
        if (arr[idx] == 0) {
            return true;
        }

        // Mark visited
        visited[idx] = true;

        // Explore both directions
        return dfs(arr, idx + arr[idx], visited) ||
               dfs(arr, idx - arr[idx], visited);
    }
}