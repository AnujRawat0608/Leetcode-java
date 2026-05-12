import java.util.*;

class Solution {

    public int minimumEffort(int[][] tasks) {

        // Sort by (minimum - actual) descending
        Arrays.sort(tasks, (a, b) -> 
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int low = 1;
        int high = (int)1e9;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canFinish(tasks, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[][] tasks, int energy) {

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            // Cannot start this task
            if (energy < minimum) {
                return false;
            }

            // Spend energy
            energy -= actual;
        }

        return true;
    }
}