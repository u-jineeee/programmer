package me.programmer.level2.p178870;

public class Main {
}
class Solution {
    public int[] solution(int[] sequence, int k) {
       int[] answer = new int[2];
       int start = 0;
       long currentSum = 0;
       int minLength = Integer.MAX_VALUE;

       for(int end = 0; end < sequence.length; end++) {
            currentSum += sequence[end];

            while(currentSum > k) {
                currentSum -= sequence[start];
                start++;
            }

            if(currentSum == k) {
                int currentLength = end - start;
                if(currentLength < minLength) {
                    minLength = currentLength;
                    answer[0] = start;
                    answer[1] = end;
                }
            }
       }
       return answer;
    }
}