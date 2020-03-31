package me.programmers.skillcheck;

import java.util.*;

public class Level2_1 {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 1;

        int len = progresses.length;
        int[] t = new int[len];
        for (int i = 0; i < len; i++) {
            int p = progresses[i];
            int s = speeds[i];

            while (true) {
                int temp = p + (s * day);

                if (temp >= 100) {
                    t[i] = day;
                    break;
                }
                day++;
            }
        }

        List<Integer> list = new ArrayList<>();
        int temp = t[0];
        int cnt = 1;
        for (int i = 1; i < len; i++) {
            if (t[i] == temp) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
                temp = t[i];
            }
        }
        list.add(cnt);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
