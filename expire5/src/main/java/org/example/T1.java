package org.example;

import java.util.Calendar;

public class T1 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2010, 4, 1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2009, 3, 11);
        System.out.println((cal.getTime().getTime() - cal2.getTime().getTime()) / (1000 * 3600 * 24));
    }
}