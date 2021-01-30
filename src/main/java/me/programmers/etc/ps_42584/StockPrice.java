package me.programmers.etc.ps_42584;

import java.util.*;

public class StockPrice {
    public int[] solution(int[] price) {
        PriorityQueue<Info> infos = new PriorityQueue<>();
        PriorityQueue<Info> results = new PriorityQueue<>(Comparator.comparingInt(Info::getIndex));
        for (int i = 0; i < price.length; i++) {
            final int p = price[i];
            if (infos.isEmpty()) {
                infos.add(new Info(0, p, i));
                continue;
            }
            while (!infos.isEmpty() && infos.peek().price > p) {
                final Info poll = infos.poll();
                poll.count += 1;
                results.add(poll);
            }
            for (Info info : infos) {
                info.count += 1;
            }
            infos.add(new Info(0, p, i));
        }

        results.addAll(infos);
        int[] result = new int[price.length];
        int idx = 0;
        while (!results.isEmpty()) {
            result[idx++] = results.poll().count;
        }

        return result;
    }

    static class Info implements Comparable<Info> {
        int count, price, index;

        public Info(int count, int price, int index) {
            this.count = count;
            this.price = price;
            this.index = index;
        }

        public int getCount() {
            return count;
        }

        public int getPrice() {
            return price;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public int compareTo(Info o) {
            return o.price - price;
        }
    }
}
