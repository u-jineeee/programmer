package me.programmer.level0.p181860;

import java.util.Stack;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, boolean[] flag) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < arr.length; i++) {
			if(flag[i]){
				for(int j = 0; j < arr[i]*2; j++)
					stack.push(ar