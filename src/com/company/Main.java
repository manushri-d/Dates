package com.company;

public class Main {

    public static void main(String[] args) {
        //PART 3
        Date bD = new Date(10, 21, 2003);
        System.out.println(Date.dateToString(bD));
        //PART 5
        Date de = new Date(6, 4, 2016);
        Date df = new Date(5, 21, 2018);
        System.out.println(daysBetween(de, df));
        Date da = new Date(1, 1, 2016);
        Date db = new Date(3, 1, 2016);
        System.out.println(daysBetween(da, db));
        Date dc = new Date(3, 1, 2000);
        Date dd = new Date(4, 20, 2005);
        System.out.println(daysBetween(dc, dd));
        //PART 6
        System.out.println(minAge(bD));
    }

    public static boolean isLeapYear(Date d){
        boolean rv = false;
        if(d.year%4 == 0 && d.year%100 !=0){ //mod 4 to see if there is any remainder
            rv = true;
        } else if(d.year%400 == 0){
            rv = true;
        }
        return rv;
    }

    public static int daysBetween(Date d1, Date d2) {
        int d1D = 0;
        int nY = 0;
        int m = 0;
        int i = 0;
        int j = 0;
        int submn = 0;
        if (d1.month == 1 || d1.month == 3 || d1.month == 5 || d1.month == 7 || d1.month == 8 || d1.month == 10 || d1.month == 12) { //finding the days in d1 month
            d1D = 31;
        } else if (d1.month == 4 || d1.month == 6 || d1.month == 9 || d1.month == 11) {
            d1D = 30;
        } else {
            if (isLeapYear(d1)) {
                d1D = 29;
            } else {
                d1D = 28;
            }
        }
        m = d1.year + 1;
        while (m < d2.year) { //finding days in between the years excluding the actual two dates
            if (m % 4 == 0) {
                nY = nY + 366;
            } else {
                nY = nY + 365;
            }
            m++;

        }
        if (d1.year == d2.year) {
            submn = d2.month - d1.month - 1;
        } else {
            submn = 12 - d1.month;
        }
        while (i < submn) { //finding the days in the month after the initial date
                i++;
                if (d1.month + i == 1 || d1.month + i == 3 || d1.month + i == 5 || d1.month + i == 7 || d1.month + i == 8 || d1.month + i == 10 || d1.month + i == 12) {
                    nY = nY + 31;
                } else if (d1.month + i == 4 || d1.month + i == 6 || d1.month + i == 9 || d1.month + i == 11) {
                    nY = nY + 30;
                } else {
                    Date nD = new Date(1, 1, d1.year );
                    if (isLeapYear(nD)) {
                        nY = nY + 29;
                    } else {
                        nY = nY + 28;
                    }
                }
            }
        if (d1.year == d2.year) {
            submn = 0;
        } else {
            submn = d2.month -1 ;
        }
            while (j < submn) { //finding the days in the month before the ending date
                j++;
                if ( j == 1 ||  j == 3 ||  j == 5 ||  j == 7 ||  j == 8 ||  j == 10 || j == 12) {
                    nY = nY + 31;
                } else if ( j == 4 ||  j == 6 || j == 9 ||  j == 11) {
                    nY = nY + 30;
                } else {
                    Date nD = new Date(1, 1, d2.year );
                    if (isLeapYear(nD)) {
                        nY = nY + 29;
                    } else {
                        nY = nY + 28;
                    }
                }
            }
            nY = nY + d2.day;
        nY = nY + (d1D - d1.day + 1);
        return nY;
    }

    public static int minAge(Date birth){
        Date tD = new Date(11,4,2019); //todays date
        int age = 0;
        age = daysBetween(birth, tD)*24*60; //24 hours in a day, 60 min in an hour
        return age;
    }
}
