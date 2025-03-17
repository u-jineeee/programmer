package me.programmer.level0.p181916;

public class Main {
}
class Solution {
	public int solution(int a, int b, int c, int d) {
		if(a == b && a == c && a == d)
			return 1111*a;
		else if(a == b && a == c )
			return (10 * a + d) * (10 * a + d);
		else if(a == b && a == d )
			return (10 * a + c) * (10 * a + c);
		else if (a == c && a == d)
			return (10 * a + b) * (10 * a + b);
		else if(b == c && b == d)
			return (10 * b + a) * (10 * b + a);
		else if(a == b && c == d)
			return (a + d) * Math.abs(a - d);
		else if(a == c && b == d)
			return (a + b) * Math.abs(a - b);
		else if(a == d && b == c)
			return (a + c) * Math.abs(a - c);
		else if(a == b)
			return c * d;
		else if(a == c)
			return b * d;
		else if(a == d)
			return b * c;
		else if(b == c)
			return a * d;
		else if(b == d)
			return a * c;
		else if(c == d)
			return a * b;
		else if(a < b && a < c && a < d)
			return a;
		else if(b < a && b < c && b < d)
			return b;
		else if(c < a && c < b && c < d)
			return c;
		else
			return d;
	}
}