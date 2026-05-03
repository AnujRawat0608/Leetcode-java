class Solution {
    public boolean rotateString(String s, String goal) {

        int n = s.length();
        int m = goal.length();

        if(n != m)return false;
        for(int i = 0; i< n ; i++){
            s = s.substring(1) + s.charAt(0);
            if(s.contains(goal)){
                return true;
            }
        }
        return false;
        
    }
}