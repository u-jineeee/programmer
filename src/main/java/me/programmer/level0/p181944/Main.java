package me.programmer.level0.p181944;
import java.util.Scanner;

public class Main {
}
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n % 2 == 0)
			System.out.print(n + " is even");
		else
			System.out.print(n + " is odd");
	}
}