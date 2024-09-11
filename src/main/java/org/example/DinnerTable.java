package org.example;

import java.util.HashSet;
import java.util.Set;

public class DinnerTable {

    public static long count(int R, int C, int L, int N) {
        // Set to hold pillar positions
        Set<String> pillars = new HashSet<>();

        // Calculate pillar positions
        for (int i = 0; i < N; i++) {
            int r = (4 * i * i + 7 * i) % R;
            int c = (i * i * i + 8 * i + 13) % C;
            pillars.add(r + "," + c);
        }

        long count = 0;

        // Horizontal placements
        for (int row = 0; row < R; row++) {
            for (int col = 0; col <= C - L; col++) {
                boolean canPlace = true;
                for (int k = 0; k < L; k++) {
                    if (pillars.contains(row + "," + (col + k))) {
                        canPlace = false;
                        break;
                    }
                }
                if (canPlace) {
                    count++;
                }
            }
        }

        // Vertical placements
        for (int col = 0; col < C; col++) {
            for (int row = 0; row <= R - L; row++) {
                boolean canPlace = true;
                for (int k = 0; k < L; k++) {
                    if (pillars.contains((row + k) + "," + col)) {
                        canPlace = false;
                        break;
                    }
                }
                if (canPlace) {
                    count++;
                }
            }
        }

        return count;
    }
}