package me.programmers.graph;

import java.util.*;

public class TravelPath {
    public String[] solution(String[][] tickets) {

        Map<String, PriorityQueue<String>> path = new HashMap<>();
        for (String[] ticket : tickets) {
            PriorityQueue<String> queue = Optional.ofNullable(path.get(ticket[0])).orElse(new PriorityQueue<>());
            queue.add(ticket[1]);
            path.put(ticket[0], queue);
        }

        String key = "ICN";

        // dfs 로 만들어서 백트래킹 해야
        Queue<String> q = new LinkedList<>();
        q.add(key);
        while (path.get(key) != null && !path.get(key).isEmpty()) {
            PriorityQueue<String> priorityQueue = path.get(key);
            String s = priorityQueue.poll();
            q.add(s);

            key = s;
        }

        int len = q.size();
        String[] answer = new String[len];
        for (int i = 0; i < len; i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}
