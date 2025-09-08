package me.programmer.level2.p42883;

import java.util.Stack;

public class Main {
}
class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for(char c : number.toCharArray()) {
            while(!stack.isEmpty() && k > 0 && stack.peek() < c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder answer = new StringBuilder();
        for(char c : stack) {
            answer.append(c);
        }
        return answer.toString();
    }
}