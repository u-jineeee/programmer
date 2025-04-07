package me.programmer.level1.p250137;

public class Main {
}
class Solution {
	public int solution(int[] bandage, int health, int[][] attacks) {
		int time = 0;
		int hp = health;
		int continuousHealTime;
		for(int[] attack : attacks) {
			int attackTime = attack[0];
			int damage = attack[1];

			continuousHealTime = attackTime - time - 1;
			time = attackTime;

			hp = currentHP(hp, continuousHealTime*bandage[1], health);
			if(continuousHealTime >= bandage[0])
				hp = currentHP(hp, bandage[2] * (continuousHealTime/bandage[0]), health);

			hp -= damage;
			if(hp <= 0)
				return -1;
		}
		return hp;
	}
	public int currentHP(int hp, int add, int health) {
		return Math.min(hp + add, health);
	}
}