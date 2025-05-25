class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length() || s == null){
            return false;
        }
        String Concatenate = s + s;
        return Concatenate.contains(goal);
        
    }
}