package me.programmer.level2.p389479;

public class Main {
}
class Solution {
    public int solution(int[] players, int m, int k) {
        int[] addServer = new int[players.length];
        int answer = 0;

        for(int i = 0; i < players.length; i++){
            if(players[i] >= m){
                int needServer = (players[i] - (m - 1)) / m;
                needServer += (players[i] - (m - 1)) % m == 0 ? 0 : 1;
                if(needServer > addServer[i]){
                    int n = needServer - addServer[i];
                    if(n > 0){
                        for(int j = i; j < i + k && j < players.length; j++)
                            addServer[j] += n;
                        answer += n;
                    }
                }
            }
        }
        return answer;
    }
}