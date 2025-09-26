package me.programmer.level2.p67257;

import java.util.*;

public class Main {
}

class Solution {
    public long solution(String expression) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        List<String> list = new LinkedList<>();
        Set<String> opSet = new HashSet<>();

        for (char c : expression.toCharArray()) {
            String s = String.valueOf(c);

            if (isOperator(s)) {
                list.add(sb.toString());
                sb = new StringBuilder();
                list.add(String.valueOf(c));

                opSet.add(s);
            } else {
                sb.append(s);
            }
        }
        if (!sb.isEmpty())
            list.add(sb.toString());

        String[] ops = opSet.toArray(new String[0]);
        List<String[]> opList = getOpList(ops);



        for(String[] priority : opList) {
            Stack<Long> numStack = new Stack<>();
            Stack<String> opStack = new Stack<>();
            long result;

            for (String token : list) {
                if (isOperator(token)) {
                    while (!opStack.isEmpty() && hasPrecedence(priority, token, opStack.peek())) {
                        long num2 = numStack.pop();
                        long num1 = numStack.pop();
                        String op = opStack.pop();
                        numStack.add(applyOp(op, num1, num2));
                    }
                    opStack.push(token);
                } else {
                    numStack.push(Long.parseLong(token));
                }
            }

            while (!opStack.isEmpty()) {
                long num2 = numStack.pop();
                long num1 = numStack.pop();
                String op = opStack.pop();
                numStack.push(applyOp(op, num1, num2));
            }

            result = numStack.pop();

            answer = Math.max(answer, Math.abs(result));
        }

        return answer;
    }
    public boolean isOperator(String op) {
        return op.equals("+") || op.equals("-") || op.equals("*");
    }
    public List<String[]> getOpList(String[] ops) {
        List<String[]> opList = new LinkedList<>();

        if(ops.length == 1)
            opList.add(new String[]{ops[0]});
        else if(ops.length == 2) {
            opList.add(new String[]{ops[0], ops[1]});
            opList.add(new String[]{ops[1], ops[0]});
        } else if(ops.length == 3) {
            opList.add(new String[]{"-", "+", "*"});
            opList.add(new String[]{"-", "*", "+"});
            opList.add(new String[]{"+", "-", "*"});
            opList.add(new String[]{"+", "*", "-"});
            opList.add(new String[]{"*", "-", "+"});
            opList.add(new String[]{"*", "+", "-"});
        }
        return opList;
    }
    public boolean hasPrecedence(String[] currentPriority, String currentOp, String stackOp) {
        List<String> priorityList = Arrays.asList(currentPriority);
        return priorityList.indexOf(currentOp) >= priorityList.indexOf(stackOp);
    }

    public long applyOp(String op, long x, long y) {
        switch (op) {
            case "*" -> {
                return x * y;
            }
            case "+" -> {
                return x + y;
            }
            case "-" -> {
                return x - y;
            }
        }
        return 0;
    }
}