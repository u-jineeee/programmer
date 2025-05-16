package me.programmer.level2.p49993;

public class Main {
}
class Solution {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		String[] str_arr = skill.split("");

		for(String skill_tree : skill_trees) {
			boolean flag = true;
			int skill_idx = 0;
			for(String skill_tree_s : skill_tree.split("")) {
				int idx = -1;
				for(int i = skill_idx; i < str_arr.length; i++) {
					if(skill_tree_s.equals(str_arr[i])) {
						idx = i;
						break;
					}
				}
				if(idx == skill_idx)
					skill_idx++;
				else if(idx > skill_idx) {
					flag = false;
					break;
				}
			}
			if(flag)
				answer++;
		}
		return answer;
	}
}