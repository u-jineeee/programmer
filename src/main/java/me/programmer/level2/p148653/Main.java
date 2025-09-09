package me.programmer.level2.p148653;

public class Main {
}
class Solution {
    public int solution(int storey) {
        int answer = 0;
        while(storey != 0) {
            int x = storey % 10;
            storey /= 10;

            if(x < 5) {
                answer += x;
            } else if(x > 5) {
                answer += 10 - x;
                storey += 1;
            } else {
                answer += 5;
                if(storey % 10 >= 5) {
                    storey += 1;
                }
            }

        }
        return answer;
    }
}