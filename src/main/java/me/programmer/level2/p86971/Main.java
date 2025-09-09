package me.programmer.level2.p86971;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
}
class Solution {
    Map<Integer, LinkedList<Integer>> map;
    public int solution(int n, int[][] wires) {
        int answer = n;
        map = new HashMap<>();

        for(int[] w : wires){
           map.computeIfAbsent(w[0],x -> new LinkedList<>()).add(w[1]);
           map.computeIfAbsent(w[1],x -> new LinkedList<>()).add(w[0]);
        }

        for(int[] w : wires){
            int v1 = w[0];
            int v2 = w[1];

            int count = bfs(v1, v2, n);

            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer, diff);
        }

        return answer;
    }
    public int bfs(int startNode, int cutNode, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n+1];

        queue.add(startNode);
        visited[startNode] = true;
        int count = 1;

        while(!queue.isEmpty()){
            int current = queue.poll();

            for(int next : map.get(current)){
                if(!visited[next] && next != cutNode){
                    visited[next] = true;
                    queue.add(next);
                    count++;
                }
            }
        }
        return count;
    }
}