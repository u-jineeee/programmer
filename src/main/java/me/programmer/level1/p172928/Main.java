package me.programmer.level1.p172928;

public class Main {
}
class Solution {
	public int[] solution(String[] park, String[] routes) {
		int h = park.length;
		int w = park[0].length();
		int[] presentP = new int[2];

		for(int i = 0; i < park.length; i++) {
			for(int j = 0; j < park[i].length(); j++)
				if(park[i].charAt(j) == 'S') {
					presentP[0] = i;
					presentP[1] = j;
				}
		}
		for(String route : routes) {
			String[] s = route.split(" ");
			String direction = s[0];
			int distance = Integer.parseInt(s[1]);
			int newX = presentP[0];
			int newY = presentP[1];
			boolean canMove = true;

			switch (direction) {
				case "E" -> newY += distance;
				case "W" -> newY -= distance;
				case "N" -> newX -= distance;
				default -> newX += distance;
			}

			if (newX < 0 || newX >= h || newY < 0 || newY >= w) {
				canMove = false;
			} else {
				switch (direction) {
					case "E" -> {
						for (int i = presentP[1] + 1; i <= newY; i++) {
							if (park[presentP[0]].charAt(i) == 'X') {
								canMove = false;
								break;
							}
						}
					}
					case "W" -> {
						for (int i = presentP[1] - 1; i >= newY; i--) {
							if (park[presentP[0]].charAt(i) == 'X') {
								canMove = false;
								break;
							}
						}
					}
					case "N" -> {
						for (int i = presentP[0] - 1; i >= newX; i--) {
							if (park[i].charAt(presentP[1]) == 'X') {
								canMove = false;
								break;
							}
						}
					}
					case "S" -> {
						for (int i = presentP[0] + 1; i <= newX; i++) {
							if (park[i].charAt(presentP[1]) == 'X') {
								canMove = false;
								break;
							}
						}
					}
				}
				if(canMove) {
					presentP[0] = newX;
					presentP[1] = newY;
				}
			}
		}
		return presentP;
	}
}