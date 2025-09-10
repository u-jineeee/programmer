package me.programmer.level2.p155651;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
}
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] times = new int[book_time.length][2];
        for(int i = 0; i < book_time.length; i++){
            times[i][0] = timeToMinutes(book_time[i][0]);
            times[i][1] = timeToMinutes(book_time[i][1]) + 10;
        }
        Arrays.sort(times, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> roomEndTimes = new PriorityQueue<>();
        for(int[] time: times){
            int startTime = time[0];
            int endTime = time[1];

            if(roomEndTimes.isEmpty()){
                roomEndTimes.add(endTime);
                continue;
            }

            int earliestEndTime = roomEndTimes.peek();
            if(startTime >= earliestEndTime){
                roomEndTimes.poll();
            }
            roomEndTimes.add(endTime);
        }

        return roomEndTimes.size();
    }
    private int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour * 60 + minute;
    }
}