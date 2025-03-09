package me.programmer.level0.p181949;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				sb.append((char)(ch - 32));
			else
				sb.append((char)(ch + 32));
		}

		System.out.println(sb);
	}
}
