package me.programmers.etc.ps_42586;

public class Development {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];

        int idx = -1;
        int workDay = 0;
        for (int i = 0; i < progresses.length; i++) {
            if (100 - (progresses[i] + (speeds[i] * workDay)) <= 0) {
                answer[idx]++;
                continue;
            }
            int x = 100 - progresses[i];
            workDay = x / speeds[i];
            if (x % speeds[i] > 0) workDay++;

            idx++;
            answer[idx] = 1;
        }

        int[] result = new int[idx + 1];
        System.arraycopy(answer, 0, result, 0, idx + 1);
        return result;
    }
}
