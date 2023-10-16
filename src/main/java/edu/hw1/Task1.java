package edu.hw1;

public class Task1 {
    private Task1() {
    }

    private static final int SEC_IN_MIN = 60;

    public static int minutesToSeconds(String time) {
        String[] units = time.split(":");

        boolean correctTime = isNumeric(units[0]) && isNumeric(units[1])
                            && units[0].length() >= 2 && units[1].length() == 2;

        int min = Integer.parseInt(units[0]);
        int sec = Integer.parseInt(units[1]);

        correctTime &= (min >= 0) && (sec >= 0 && sec < SEC_IN_MIN);
        if (!correctTime) {
            return -1;
        }

        return min * SEC_IN_MIN + sec;
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }
}
