package me.programmers.etc.ps_12978;

import java.util.*;

public class Solution {

    public int solution(int N, int[][] road, int K) {

        List<List<Town>> list = new ArrayList<>();
        for (int i = 1; i <= N + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] ints : road) {
            list.get(ints[0]).add(new Town(ints[1], ints[2]));
            list.get(ints[1]).add(new Town(ints[0], ints[2]));
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        int[] dist = new int[N + 1];
        Arrays.fill(dist, 500_001);
        dist[1] = 0;
        while (!q.isEmpty()) {
            int s = q.poll();
            List<Town> towns = list.get(s);
            for (Town town : towns) {
                int n = town.getNumber();
                int d = town.getDistance();

                if (dist[s] + d < dist[n]) {
                    dist[n] = dist[s] + d;
                    q.add(n);
                }
            }
        }

        int answer = 0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] <= K) answer++;
        }

        return answer;
    }


    static class Town {
        private int number;
        private int distance;

        public Town(int number, int distance) {
            this.number = number;
            this.distance = distance;
        }

        public int getNumber() {
            return number;
        }

        public int getDistance() {
            return distance;
        }
    }
}
