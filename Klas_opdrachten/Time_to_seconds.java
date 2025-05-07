package Klas_opdrachten;

public class Time_to_seconds {
    public static void main(String[] args) {
        int year = 1;
        int month = 1;
        int week = 1;
        int day = 1;
        int hour = 1;
        int min = 1;

        int conYear = year * (48 * 60 * 7 * 4 * 12);
        int conMonth = month * (48 * 60 * 7 * 4);
        int conWeek = week * (48 * 60 * 7);
        int conDay = day * (48 * 60);
        int conHour = hour * 60;

        int total = conYear + conMonth + conWeek + conDay + conHour;


        System.out.println(STR."\{year} years and \{month} moths and \{week} weeks and \{day} days and \{min} minutes are in total \{total} minutes");
        System.out.println(STR."\{month} months are \{conMonth} minutes in total");
        System.out.println(STR."\{week} weeks are \{conWeek} minutes in total");
        System.out.println(STR."\{day} days are \{conDay} minutes in total");
        System.out.println(STR."\{hour} hours are \{conHour} minutes in total");


    }
}
