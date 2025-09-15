package me.programmer.level2.p12978;

public class Main {
}
class Solution {
    public int solution(int N, int[][] road, int K) {
        final int INF = 500001;
        int[][] dist = new int[N+1][N+1];
        int answer = 0;

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(i == j) {
                    dist[i][j] = 0;
                } else  {
                    dist[i][j] = INF;
                }
            }
        }

        for(int[] r : road) {
            int u = r[0];
            int v = r[1];
            int weight = r[2];

            dist[u][v] = Math.min(dist[u][v], weight);
            dist[v][u] = Math.min(dist[v][u], weight);
        }

        for(int k = 1; k <= N; k++) {
            for(int i = 1; i <= N; i++) {
                for(int j = 1; j <= N; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        for(int i = 1; i <= N; i++) {
            if(dist[1][i] <= K)
                answer++;
        }
        return answer;
    }
}