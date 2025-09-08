package me.programmer.level2.p42839;

import java.util.HashSet;
import java.util.Set;

public class Main {
}

class Solution {
    Set<Integer> set = new HashSet<>();
    char[] chars;
    boolean[] visited;

    public int solution(String numbers) {
        chars = numbers.toCharArray();
        visited = new boolean[numbers.length()];
        int answer = 0;

        dfs("");
        for(int x : set) {
            if(isPrime(x))
                answer++;
        }
        return answer;
    }

    public void dfs(String currentNum) {
        if(!currentNum.isEmpty())
            set.add(Integer.parseInt(currentNum));

        for(int i = 0; i < chars.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(currentNum + chars[i]);
                visited[i] = false;
            }
        }
    }
    public boolean isPrime(int x) {
        if (x < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}