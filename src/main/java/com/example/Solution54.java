package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DAY_OF_WEEK;

public class Solution54 {
    public String solution54(int a, int b) {
        String answer = "";

        final String[] DAY_OF_WEEK = {"","SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar cal = Calendar.getInstance();
        cal.set(2016,a-1,b);

        answer+= DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)];
        return answer;
    }

}
