class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.add(start);
        visited[start] = true;
            while(!queue.isEmpty()){
                int i = queue.poll();
                if(arr[i] == 0)return true;

                int left = i - arr[i];
                int right= i + arr[i];

                if(left >= 0 && !visited[left]){
                    visited[left] = true;
                    queue.add(left);
                }
                if(right < n && !visited[right]){
                    visited[right] = true;
                    queue.add(right);
                }
            }
            return false;
         
    }
}