package me.programmer.level0.p120907;

public class Main {
}
class Solution {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for(int i = 0; i < quiz.length; i++) {
			String[] array = quiz[i].split(" ");
			int x = Integer.parseInt(array[0]);
			int y = Integer.parseInt(array[2]);
			int z = Integer.parseInt(array[4]);
			if(array[1].equals("+")) {
				if(x + y == z)
					answer[i] = "O";
				else
					answer[i] = "X";
			} else {
				if(x - y == z)
					answer[i] = "O";
				else
					answer[i] = "X";
			}
		}
		return answer;
	}
}