class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n = asteroids.length;

        long currentmass = mass;
        
        for(int m : asteroids){
            if(currentmass >= m){
                currentmass += m;
            }else{
                return false;
            }
        }
        return true;
    }
}