package me.programmer.level2.p12899;

public class Main {
}
class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        while (n > 0) {
            int r = n % 3;

            if ( r == 0) {
                r = 4;
                n = n / 3 - 1;
            } else
                n = n / 3;
            answer.append(r);
        }
        return answer.reverse().toString();
    }
}