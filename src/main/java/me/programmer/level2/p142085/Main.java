package me.programmer.level2.p142085;

import java.util.PriorityQueue;

public class Main {
}
class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < enemy.length; i++){
            int e = enemy[i];

            pq.add(e);
            if(pq.size() > k){
                n -= pq.poll();
            }
            if(n < 0){
                return i;
            }
        }

        return enemy.length;
    }
}