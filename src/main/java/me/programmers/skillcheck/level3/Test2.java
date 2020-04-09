package me.programmers.skillcheck.level3;

import java.util.Arrays;

public class Test2 {
    public int solution(int[] weight) {
        int answer = 1;
        Arrays.sort(weight);
        for(int i = 0; i < weight.length; i++) {
            if(answer < weight[i]) {
                break;
            }
            answer += weight[i];
        }
        return answer;
    }
}

