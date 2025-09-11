package me.programmer.level2.p135807;

public class Main {
}
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        for(int i = 1; i < arrayA.length; i++)
            gcdA = gcd(gcdA, arrayA[i]);
        for(int i = 1; i < arrayB.length; i++)
            gcdB = gcd(gcdB, arrayB[i]);

        for(int b : arrayB) {
            if(b % gcdA == 0) {
                gcdA = 0;
                break;
            }
        }
        for(int a : arrayA) {
            if(a % gcdB == 0) {
                gcdB = 0;
                break;
            }
        }
        return Math.max(gcdA, gcdB);
    }
    public int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}