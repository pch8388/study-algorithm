package me.programmers.skillcheck.level3;

import java.util.Arrays;

public class Test5 {
    public String solution(int n, int t, int m, String[] timetable) {
        Arrays.sort(timetable);
        index = 0;
        dfs("09:00", 1, n, t, m, timetable);
        return answer;
    }

    static int index;
    static String answer;
    void dfs(String time, int cnt, int n, int t, int m, String[] timetable) {
        if (n == cnt) {
            int len = timetable.length;
            // 자리가 타야될 사람보다 많거나 같게 남았다면 time 반환
            if (len - (index - 1) <= m) {
                answer = time;
                return;
            }
            // 꽉 차면 마지막 사람보다 1분빠르게
            int k = 0;
            for (int i = 0; i < m; i++) {
                final int compare = time.compareTo(timetable[index]);
                if (compare >= 0) {
                    index++;
                    k++;
                }
            }

            if (k < m) {
                answer = time;
                return;
            }
            final String lastTime = timetable[index - 1];
            int hour = Integer.parseInt(lastTime.split(":")[0]);
            int minute = Integer.parseInt(lastTime.split(":")[1]);

            minute--;

            if (minute < 0) {
                hour--;
                minute = 59;
            }
            answer = String.format("%02d:%02d", hour, minute);
            return;
        }

        int hour = Integer.parseInt(time.split(":")[0]);
        int minute = Integer.parseInt(time.split(":")[1]);

        for (int i = 0; i < m; i++) {
            final int compare = time.compareTo(timetable[index]);
            if (index + 1 < timetable.length && compare >= 0) {
                index++;
            }
        }

        minute += t;
        if (minute >= 60) {
            hour++;
            minute = minute % 60;
        }

        String nextTime = String.format("%02d:%02d", hour, minute);
        dfs(nextTime, cnt + 1, n, t, m, timetable);
    }
}
