package me.programmer.level1.p118666;

public class Main {
}
class Solution {
	public String solution(String[] survey, int[] choices) {
		StringBuilder answer = new StringBuilder();
		int[] choiceScore = {3, 2, 1, 0, 1, 2, 3};
		int[] RTS = new int[2], CFS = new int[2], JMS = new int[2],ANS = new int[2];
		for(int i = 0; i < survey.length; i++) {
			char ch;
			if(choices[i] < 4) {
				ch = survey[i].charAt(0);
			} else {
				ch = survey[i].charAt(1);
			}
			countScore(choices, choiceScore, RTS, CFS, JMS, ANS, i, ch);
		}
		if(RTS[0] >= RTS[1])
			answer.append("R");
		else
			answer.append("T");
		if(CFS[0] >= CFS[1])
			answer.append("C");
		else
			answer.append("F");
		if(JMS[0] >= JMS[1])
			answer.append("J");
		else
			answer.append("M");
		if(ANS[0] >= ANS[1])
			answer.append("A");
		else
			answer.append("N");
		return answer.toString();
	}

	private void countScore(int[] choices, int[] choiceScore, int[] RTS, int[] CFS, int[] JMS, int[] ANS, int i,
		char ch) {
		if(ch == 'R')
			RTS[0] += choiceScore[choices[i]-1];
		else if(ch == 'T')
			RTS[1] += choiceScore[choices[i]-1];
		else if(ch == 'C')
			CFS[0] += choiceScore[choices[i]-1];
		else if(ch == 'F')
			CFS[1] += choiceScore[choices[i]-1];
		else if(ch == 'J')
			JMS[0] += choiceScore[choices[i]-1];
		else if(ch == 'M')
			JMS[1] += choiceScore[choices[i]-1];
		else if(ch == 'A')
			ANS[0] += choiceScore[choices[i]-1];
		else if(ch == 'N')
			ANS[1] += choiceScore[choices[i]-1];
	}
}