class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
          int n = intervals.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            boolean covered = false;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                int a = intervals[i][0], b = intervals[i][1];
                int c = intervals[j][0], d = intervals[j][1];
                
                if (c <= a && b <= d) {
                    covered = true;
                    break;
                }
            }
            if (!covered) count++;
        }
        
        return count;
    }
}
/*

array of intervals - interval[i] = [li,ri]

we have to remove all intervals that r covered by another interval in list
(a,b) is covered by (c,d) if c<=a and b<=d

return number of intervals after removing all the covered intervals

interval[1,4],[3,6],[2,8]
a = 1 c = 2 
b = 4 d = 3
no coverd

a = 2, c = 1 c<a
b = 3, d = 4 b<d
covered - remove

so ant each iteration while iterating the intervals we will consider each pair as ab and bc and compare them and if ths=e condition is true we will remove the pair and return the remining total number 

the above example is for the the example number 2 






*/