class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] comp = new int[n];
        comp[0] = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                comp[i] = comp[i - 1];
            } else {
                comp[i] = comp[i - 1] + 1;
            }
        }

        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            ans[i] = (comp[u] == comp[v]);
        }

        return ans;
    }
}
/*
given - int n , represnting number of nodes in graph 0 to n-1;
int[] nums of length n in ascending(small to big) and
maxDiff integer

undirected edge (the line) exists between nodes i and j 
absoulte diff between nums[i] and nums[j] is at most maxDiff(nums[i] - nums[j] <= maxDiff)

2d integer array queries : queries[i] = [ui, vi]

to find - whether there exists a path between nodes ui and vi 
retun boolean array answer where ans[i] is true - if there exists a path between ui and vi in the ith query



*/