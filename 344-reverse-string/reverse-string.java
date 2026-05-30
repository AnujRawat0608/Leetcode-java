class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] result = new char[n];
        int idx = 0;

        for(int i=n-1; i>=0; i--){
            result[idx] = s[i];
            idx++;
        }
        for(int i=0; i<n; i++){
            s[i] = result[i]; 
        }
        
    }
}