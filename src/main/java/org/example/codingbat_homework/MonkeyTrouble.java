package org.example.codingbat_homework;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }

    public static class SleepIn {
        public boolean sleepIn(boolean weekday, boolean vacation) {
         if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    }
}
