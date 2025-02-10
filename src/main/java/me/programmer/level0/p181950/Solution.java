package me.programmer.level0.p181950;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		String str = sc.next();
		int n = sc.nextInt();

		stringBuilder.append(String.valueOf(str).repeat(Math.max(0, n)));
		System.out.println(stringBuilder);
	}
}