package me.programmers.study;

import java.util.*;

public class RacePlayer {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int len = participant.length;
        int j = 0;
        int max = len - 1;
        for (String s : participant) {
            if (j == max) {
                return s;
            }
            if (!s.equals(completion[j++])) {
                return s;
            }
        }

        return "";
    }
}
