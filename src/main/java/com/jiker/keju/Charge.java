package com.jiker.keju;

public class Charge {

    public int getCountByDisAndTime(int distance, int time) {
        if (distance <= 2) {
            return (int) Math.round(6 + time * 0.25);
        } else if (distance > 2 && distance <= 8) {
            return (int) Math.round((6 + (distance - 2) * 0.8) + time * 0.25);
        } else {
            return (int) Math.round((6 + 6 * 0.8 + (distance - 8) * 1.2) + time * 0.25);
        }

    }
}
