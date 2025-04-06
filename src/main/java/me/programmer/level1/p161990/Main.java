package me.programmer.level1.p161990;

public class Main {
}
class Solution {
	public int[] solution(String[] wallpaper) {
		int lux = -1, luy = -1, rdx = -1, rdy = -1;
		for(int i = 0; i < wallpaper.length; i++) {
			for(int j = 0; j < wallpaper[i].length(); j++) {
				if(wallpaper[i].charAt(j) == '#') {
					if(lux == -1 || lux > i) {
						lux = i;
					}
					if(luy == -1 || luy > j) {
						luy = j;
					}
					if(rdx == -1 || rdx <= i) {
						rdx = i+1;
					}
					if(rdy == -1 || rdy <= j) {
						rdy = j+1;
					}
				}
			}
		}
		return new int[]{lux, luy, rdx, rdy};
	}
}