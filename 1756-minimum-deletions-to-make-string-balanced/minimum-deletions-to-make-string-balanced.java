class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();

        int[] countA = new int[n];
        int[] countB = new int[n];

        int bcount = 0;

        for(int i=0; i< n; i++){
            countB[i] = bcount;
            if(s.charAt(i) == 'b')bcount++;
        }

        int acount = 0;

        for(int i= n-1; i>=0 ; i--){
            countA[i] = acount;
            if(s.charAt(i) == 'a')acount++;

        }

        int minDeletions = n;
        for(int i=0; i<n; i++){
            minDeletions = Math.min(minDeletions, countA[i] + countB[i]);
        }
return minDeletions;

        
    }
}