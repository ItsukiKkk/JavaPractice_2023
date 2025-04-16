package com.edu.seiryo.sj;
import java.util.Calendar;
import java.util.Date;

public class S2 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        Calendar currentDate = Calendar.getInstance();
        int count = 0;
        currentDate.add(Calendar.WEEK_OF_YEAR, -100);
        while (count < 100) {
            if (currentDate.get(Calendar.DAY_OF_WEEK) == today.get(Calendar.DAY_OF_WEEK) &&
                    currentDate.get(Calendar.DAY_OF_MONTH) == today.get(Calendar.DAY_OF_MONTH)) {
                Date date = currentDate.getTime();
                System.out.println("Æ¥ÅäÈÕÆÚ£º" + date);
                count++;
            }
            currentDate.add(Calendar.DAY_OF_YEAR, 1);
        }
    }
}
