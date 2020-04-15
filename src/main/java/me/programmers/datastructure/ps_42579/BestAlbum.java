package me.programmers.datastructure.ps_42579;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int n = genres.length;

        HashMap<String, List<Detail>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Detail> details = map.getOrDefault(genres[i], new ArrayList<>());
            details.add(new Detail(i, plays[i]));
            map.put(genres[i], details);
        }

        int m = 0;
        for (List<Detail> details : map.values()) {
            m += Math.min(2, details.size());
        }

        List<Kind> list = map.entrySet().stream()
            .map(e -> new Kind(e.getKey(), e.getValue().stream().map(d -> d.count).reduce(0, Integer::sum), e.getValue()))
            .sorted().collect(toList());

        int[] answer = new int[m];
        int idx = 0;
        for (Kind kind : list) {
            Collections.sort(kind.details);
            int k = Math.min(2, kind.details.size());
            for (int i = 0; i < k; i++) {
                answer[idx++] = kind.details.get(i).index;
            }
        }
        return answer;
    }
}

class Kind implements Comparable<Kind> {
    String name;
    int count;
    List<Detail> details;

    public Kind(String name, int count, List<Detail> details) {
        this.name = name;
        this.count = count;
        this.details = details;
    }

    @Override
    public int compareTo(Kind k) {
        if (count < k.count) {
            return 1;
        } else if (count > k.count) {
            return -1;
        }
        return 0;
    }
}

class Detail implements Comparable<Detail> {
    int index, count;

    public Detail(int index, int count) {
        this.index = index;
        this.count = count;
    }

    @Override
    public int compareTo(Detail o) {
        if (count < o.count) {
            return 1;
        } else if (count > o.count) {
            return -1;
        }
        if (index > o.index) {
            return 1;
        }
        return -1;
    }
}