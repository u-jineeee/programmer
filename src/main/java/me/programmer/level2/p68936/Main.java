package me.programmer.level2.p68936;

public class Main {
}

class Solution {
    int[] answer = {0, 0};
    int[][] globalArr;
    public int[] solution(int[][] arr) {
        globalArr = arr;
        solve(0, 0, arr.length);
        return answer;
    }
    public void solve(int row, int col, int size) {
        boolean flag = true;
        int x = globalArr[row][col];
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(x != globalArr[i][j]) {
                    flag = false;
                    break;
                }
            }
            if(!flag)
                break;
        }
        if(flag) {
            answer[x]++;
        } else {
            int newSize = size/2;
            solve(row, col, newSize);
            solve(row + newSize, col, newSize);
            solve(row, col + newSize, newSize);
            solve(row + newSize, col + newSize, newSize);
        }
    }
}