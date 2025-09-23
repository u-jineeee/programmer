package me.programmer.level2.p12936;

import java.util.LinkedList;
import java.util.List;

public class Main {
}
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new LinkedList<>();

        long[] factorial = new long[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++)
            factorial[i] = factorial[i - 1] * i;

        for(int i = 1; i <= n; i++)
            list.add(i);

        k--;

        for(int i = 0; i < n; i++) {
            long size = factorial[n - 1 - i];

            int index = (int) (k / size);

            answer[i] = list.get(index);
            list.remove(index);

            k %= size;
        }

        return answer;
    }
}