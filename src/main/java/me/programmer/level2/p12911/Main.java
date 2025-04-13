package me.programmer.level2.p12911;

public class Main {
}
class Solution {
	public int solution(int n) {
		int one_cnt1 = 0;
		String s = Integer.toBinaryString(n);
		for(char ch : s.toCharArray())
			if(ch == '1')
				one_cnt1++;
		while(true) {
			String str = Integer.toBinaryString(++n);
			int one_cnt2 = 0;
			for(char ch : str.toCharArray())
				if(ch == '1')
					one_cnt2++;
			if(one_cnt1 == one_cnt2)
				return n;
		}
	}
}