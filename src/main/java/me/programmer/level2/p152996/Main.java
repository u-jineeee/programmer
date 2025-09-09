package me.programmer.level2.p152996;

import java.util.Arrays;

public class Main {
}
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        long[] memo = new long[1001];
        Arrays.sort(weights);
        for(int w : weights){
            if(memo[w] != 0) {
                answer += memo[w];
            }
            if(w * 2 % 3 == 0 && memo[w * 2 / 3] != 0){
                answer += memo[w * 2 / 3];
            }
            if(w * 2 % 4 == 0 && memo[w * 2 / 4] != 0){
                answer += memo[w * 2 / 4];
            }
            if(w * 3 % 4 == 0 && memo[w * 3 / 4] != 0){
                answer += memo[w * 3 / 4];
            }

            memo[w]++;
        }
        return answer;
    }
}