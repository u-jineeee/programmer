package me.programmer.level2.p17686;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}
class Solution {
	public String[] solution(String[] files) {
		List<File> fileList = new ArrayList<>();
		String[] answer = new String[files.length];

		for(int i = 0; i < files.length; i++)
			fileList.add(new File(files[i], i));

		Collections.sort(fileList);

		for(int i = 0; i < files.length; i++) {
			answer[i] = fileList.get(i).originalName;
		}
		return answer;
	}
}
class File implements Comparable<File> {
	String originalName;
	String head;
	int number;
	int originalIndex;

	public File(String originalName, int originalIndex) {
		this.originalName = originalName;
		this.originalIndex = originalIndex;

		int numStartIdx = -1;
		int numEndIdx = -1;
		for(int i = 0; i < originalName.length(); i++) {
			char c = originalName.charAt(i);

			if(Character.isDigit(c) && numStartIdx == -1)
				numStartIdx = i;

			if(numStartIdx != -1 && !Character.isDigit(c)){
				numEndIdx = i;
				break;
			}
		}
		if(numStartIdx != -1 && numEndIdx == -1)
			numEndIdx = originalName.length();

		this.head = originalName.substring(0, numStartIdx);
		this.number = Integer.parseInt(originalName.substring(numStartIdx, numEndIdx));
	}

	@Override
	public int compareTo(File o) {
		int headCompare = this.head.toLowerCase().compareTo(o.head.toLowerCase());
		if(headCompare != 0)
			return headCompare;

		int numCompare = Integer.compare(this.number, o.number);
		if(numCompare != 0)
			return numCompare;

		return Integer.compare(this.originalIndex, o.originalIndex);
	}
}