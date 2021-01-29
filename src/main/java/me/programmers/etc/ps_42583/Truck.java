package me.programmers.etc.ps_42583;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridgeTrucks = new LinkedList<>();
        int bridgeTrucksWeight = 0;
        int result = 0;
        for (int t : truck_weights) {
            while (true) {
                if (bridgeTrucks.isEmpty()) {
                    bridgeTrucks.add(t);
                    bridgeTrucksWeight += t;
                    result++;
                    break;
                } else if (bridgeTrucks.size() == bridge_length) {
                    bridgeTrucksWeight -= bridgeTrucks.poll();
                } else {
                    if (bridgeTrucksWeight + t > weight) {
                        bridgeTrucks.add(0);
                        result++;
                    } else {
                        bridgeTrucks.add(t);
                        bridgeTrucksWeight += t;
                        result++;
                        break;
                    }
                }
            }
        }
        return result + bridge_length;
    }
}