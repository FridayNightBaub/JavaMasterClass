package com.company;

public class Main {

    public static void main(String[] args) {

      String durationOfTime =  getDurationString(3945);

        System.out.println(getDurationString(75, 45));

        System.out.println(durationOfTime);


    }

    private static String getDurationString(int minutes, int seconds){
        if((minutes >= 0) && (seconds >= 0 && seconds <= 59)){
            int convertMinutesToHours = minutes / 60;
            int leftOverMinutes = minutes % 60;

            return convertMinutesToHours + " hours "  + leftOverMinutes + " minutes " + seconds;

        }
        return "Invalid Value";
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int convertSecondsToMinutes = seconds / 60;
            int leftOverSeconds = seconds % 60;

            return getDurationString(convertSecondsToMinutes,leftOverSeconds);

        }
        return "Invalid Value";

    }
}
