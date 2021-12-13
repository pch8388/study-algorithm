package me.programmers.study;

import java.util.*;

public class FailRate {
    public int[] solution(int N, int[] stages) {
        List<Stage> stageList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            stageList.add(new Stage(i));
        }

        for (int s : stages) {
            for (int i = 1; i <= s; i ++) {
                if (i == N + 1) {
                    break;
                }
                if (i == s) {
                    stageList.get(i - 1).lose();
                } else {
                    stageList.get(i - 1).win();
                }
            }
        }

        Collections.sort(stageList);

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).getId();
        }

        return answer;
    }

    static class Stage implements Comparable<Stage> {
        private int id;
        private int challenger;
        private int winner;

        Stage(int id) {
            this.id = id;
            this.challenger = 0;
            this.winner = 0;
        }

        public int compareTo(Stage s) {
            if (this.failRate() < s.failRate()) {
                return 1;
            } else if (this.failRate() == s.failRate()) {
                if (this.id > s.id) {
                    return 1;
                }
            }
            return -1;
        }

        void win() {
            this.challenger++;
            this.winner++;
        }

        void lose() {
            this.challenger++;
        }

        double failRate() {
            if (this.challenger - this.winner == 0) {
                return 0;
            }
            return (this.challenger - this.winner) / (double)this.challenger;
        }

        int getId() {
            return this.id;
        }
    }
}
