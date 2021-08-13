public class Clock {
    private static final double ANGLE_HOUR_HAND_PER_MINUTE = 0.5;
    private static final double ANGLE_MINUTE_HAND_PER_MINUTE = 6;

    public static double angle(int hour, int minute) {
        if(hour < 0 || minute < 0 || hour > 23 || minute > 59) {
            throw new IllegalArgumentException("Incorrect time format");
        }
        double hourAngle = (hour % 12 * 60 + minute) * ANGLE_HOUR_HAND_PER_MINUTE;
        double minuteAngle = minute * ANGLE_MINUTE_HAND_PER_MINUTE;
        return Math.abs(hourAngle - minuteAngle);
    }
}
