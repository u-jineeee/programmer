package me.programmer.level2.p68645;

public class Main {
}
class Solution {
    public int[] solution(int n) {
        int [][] arr = new int[n][n];
        int y = -1;
        int x = 0;
        int num = 1;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i % 3 == 0) {
                    y++;
                } else if(i % 3 == 1) {
                    x++;
                } else if(i % 3 == 2) {
                    y--;
                    x--;
                }
                arr[y][x] = num++;
            }
        }

        int[] answer = new int[n*(n+1)/2];
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0)
                    break;
                answer[idx++] = arr[i][j];
            }
        }
        return answer;
    }
}