package me.programmer.level1.p340213;

public class Main {
}
class Solution {
	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		for(String command : commands) {
			if(isOpeningInterval(pos, op_start, op_end))
				pos = op_end;
			if(command.equals("prev")) {
				if(isPreviousPositionUnderTenSeconds(pos))
					pos = "00:00";
				else
					pos = formatTimeAsString(pos, -10);
			} else if(command.equals("next")) {
				if(isRemainingTimeUnderTenSeconds(video_len, pos))
					pos = video_len;
				else
					pos = formatTimeAsString(pos, 10);
			}
		}
		if(isOpeningInterval(pos, op_start, op_end))
			pos = op_end;
		return pos;
	}
	public String formatTimeAsString(String pos, int time) {
		StringBuilder pos_current = new StringBuilder();
		int pos_int = getMinute(pos) + time;

		if(pos_int/60 < 10)
			pos_current.append("0");
		pos_current.append(pos_int/60);
		pos_current.append(":");
		if(pos_int%60 < 10)
			pos_current.append("0");
		pos_current.append(pos_int%60);

		return pos_current.toString();
	}
	public int getMinute(String time) {
		String[] s = time.split(":");

		return Integer.parseInt(s[0])*60 + Integer.parseInt(s[1]);
	}
	public boolean isOpeningInterval(String pos, String op_start, String op_end) {
		int pos_int = getMinute(pos);
		int start_int = getMinute(op_start);
		int end_int = getMinute(op_end);

		return pos_int >= start_int && pos_int <= end_int;
	}
	public boolean isPreviousPositionUnderTenSeconds(String pos) {
		int pos_int = getMinute(pos);

		return pos_int < 10;
	}
	public boolean isRemainingTimeUnderTenSeconds(String video_len, String pos) {
		int video_int = getMinute(video_len);
		int pos_int = getMinute(pos);

		return video_int - pos_int < 10;
	}
}