class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n = asteroids.length;

        long currentmass = mass;
        
        for(int i=0; i<n; i++){
            if(currentmass >= asteroids[i]){
                currentmass += asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}