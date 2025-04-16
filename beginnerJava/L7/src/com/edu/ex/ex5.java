package com.edu.ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex5 {
    public static void main(String[] args) {
        Calendar cal =  Calendar.getInstance();
        cal.set(2005,07,05);
        long time1 = cal.getTimeInMillis();
        cal.set(2009,01,01);
        long time2 = cal.getTimeInMillis();
        long a = time2 - time1;
        System.out.println(a/24/60/60/1000);
    }
}
