package me.programmer.level2.p72411;

import java.util.*;

public class Main {
}
class Solution {
    Map<String, Integer> map;
    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
        map = new HashMap<>();

        for(String order : orders){
            char[] chars = order.toCharArray();
            Arrays.sort(chars);
            String sortedOrder = new String(chars);

            for(int c : course){
                if(c <= sortedOrder.length()){
                    dfs(sortedOrder, "", 0, c);
                }
            }
        }

        for(int c : course){
            int maxCourse = 0;
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(entry.getKey().length() == c) {
                    if (entry.getValue() > maxCourse) {
                        maxCourse = entry.getValue();
                    }
                }
            }
            if(maxCourse < 2)
                continue;

            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(entry.getKey().length() == c && entry.getValue() == maxCourse){
                    answer.add(entry.getKey());
                }
            }
        }
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
    public void dfs(String order, String current, int startIdx, int targerLength) {
        if(current.length() == targerLength) {
            map.put(current, map.getOrDefault(current, 0) + 1);
            return;
        }

        for(int i = startIdx; i < order.length(); i++){
            char nextChar = order.charAt(i);
            dfs(order, current + nextChar, i + 1, targerLength);
        }
    }
}