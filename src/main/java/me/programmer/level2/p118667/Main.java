package me.programmer.level2.p118667;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
}
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0;
        long sum2 = 0;
        int answer = 0;

        for (int q : queue1) {
            q1.add(q);
            sum1 += q;
        }
        for (int q : queue2) {
            q2.add(q);
            sum2 += q;
        }
        long totalSum = sum1 + sum2;

        if(totalSum % 2 == 1)
            return -1;

        long targetSum = totalSum / 2;
        while(true) {
            if(sum1 == sum2)
                break;
            else if(!q1.isEmpty() && sum1 > targetSum) {
                int x = q1.poll();
                q2.add(x);
                sum1 -= x;
                sum2 += x;
                answer++;
            } else if(!q2.isEmpty() && sum1 < targetSum) {
                int x = q2.poll();
                q1.add(x);
                sum2 -= x;
                sum1 += x;
                answer++;
            }

            if(answer > (queue1.length + queue2.length)*2)
                return -1;
        }
        return answer;
    }
}