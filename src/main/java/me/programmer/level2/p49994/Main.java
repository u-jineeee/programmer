package me.programmer.level2.p49994;

import java.util.HashSet;
import java.util.Set;

public class Main {
}
class Solution {
	public int solution(String dirs) {
		int answer = 0;
		int px = 0, py = 0;
		Set<String> visitedPaths = new HashSet<>();

		for(char dir : dirs.toCharArray()) {
			int x = px, y = py;
			switch(dir) {
				case 'U' -> y += 1;
				case 'D' -> y -= 1;
				case 'R' -> x += 1;
				case 'L' -> x -= 1;
			}
			if(!isWithinBounds(x, y))
				continue;
			String path1 = String.format("%d %d %d %d", px, py, x, y);
			String path2 = String.format("%d %d %d %d", x, y, px, py);
			if(!visitedPaths.contains(path1)) {
				visitedPaths.add(path1);
				visitedPaths.add(path2);
				answer++;
			}
			px = x;
			py = y;
		}
		return answer;
	}
	public boolean isWithinBounds(int x, int y) {
		return x >= -5 && x <= 5 && y >= -5 && y <= 5;
	}

}