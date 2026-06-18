class Solution {
    public double angleClock(int hour, int minutes) {
        //convert 12 to 0 degree
        hour = hour % 12;

        double hourAngle = (hour * 30) + (minutes * 0.5);
        double minuteangle = minutes * 6;
        double diff = Math.abs(hourAngle - minuteangle );

        return Math.min(diff,360-diff);
    }
}