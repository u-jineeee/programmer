package me.programmer.level2.p42583;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
}
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;
        int truckIndex = 0;
        while(!(truckIndex == truck_weights.length)) {
            time ++;
            if(bridge.size() == bridge_length) {
                int x = bridge.poll();
                currentWeight -= x;
            }

            if(truck_weights[truckIndex] + currentWeight <= weight) {
                bridge.add(truck_weights[truckIndex]);
                currentWeight += truck_weights[truckIndex];
                truckIndex++;
            }
            else
                bridge.add(0);
        }

        return time + bridge_length;
    }
}