package me.programmer.level2.p17683;

public class Main {
}
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int max = -1;

        m = replaceToSharps(m);

        for(String musicinfo : musicinfos){
            String[] info = musicinfo.split(",");

            int time = timeToMinute(info[1]) - timeToMinute(info[0]);
            String title = info[2];
            String sheet = replaceToSharps(info[3]);

            StringBuilder fullSheet = new StringBuilder();
            for(int i = 0; i < time; i++) {
                fullSheet.append(sheet.charAt(i % sheet.length()));
            }
            if(fullSheet.toString().contains(m)){
                if(max < time) {
                    answer = title;
                    max = time;
                }
            }
        }

        return answer;
    }
    public int timeToMinute(String time){
        String[] t = time.split(":");
        return Integer.parseInt(t[0])*60 + Integer.parseInt(t[1]);
    }
    public String replaceToSharps(String sheet){
        sheet = sheet.replaceAll("C#", "c");
        sheet = sheet.replaceAll("D#", "d");
        sheet = sheet.replaceAll("F#", "f");
        sheet = sheet.replaceAll("G#", "g");
        sheet = sheet.replaceAll("A#", "a");
        sheet = sheet.replaceAll("B#", "C");
        sheet = sheet.replaceAll("E#", "F");
        return sheet;
    }
}