package me.boj.greedy.ps_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Meeting> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            list.add(new Meeting(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }

        Collections.sort(list);
        int end = list.get(0).end;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (end <= list.get(i).start) {
                end = list.get(i).end;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

class Meeting implements Comparable<Meeting> {
    int start, end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting m) {
        if (this.end > m.end) {
            return 1;
        } else if (this.end == m.end) {
            if (this.start > m.start) {
                return 1;
            }
        }
        return -1;
    }
}
