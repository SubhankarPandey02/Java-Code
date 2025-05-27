 class SecondsAndMinutesChallenge {

    // Method 1: Takes total seconds
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value: seconds must be >= 0";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        // Call the overloaded method
        return getDurationString(minutes, remainingSeconds);
    }

    // Method 2: Takes minutes and seconds
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value: minutes must be >= 0 and seconds between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); // Expected: 1h 5m 45s
        System.out.println(getDurationString(65, 45)); // Expected: 1h 5m 45s
        System.out.println(getDurationString(-5));     // Expected: Invalid value
        System.out.println(getDurationString(5, 61));  // Expected: Invalid value
    }
}
