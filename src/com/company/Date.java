package com.company;

public class Date {
    int month,day, year;

    public Date(){
        month = 1;
        day = 1;
        year = 2019;
    }

    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    public static String monthName(Date d){
        String monthN;
        if (d.month == 1){
            monthN = "January";
        } else if(d.month == 2){
            monthN = "February";
        } else if(d.month == 3){
            monthN = "March";
        } else if(d.month == 4){
            monthN = "April";
        } else if(d.month == 5){
            monthN = "May";
        } else if(d.month == 6){
            monthN = "June";
        }else if(d.month == 7){
            monthN = "July";
        } else if(d.month == 8){
            monthN = "August";
        } else if(d.month == 9){
            monthN = "September";
        } else if(d.month == 10){
            monthN = "October";
        } else if(d.month == 11){
            monthN = "November";
        } else {
            monthN = "December";
        }
        return monthN;
    }

    public static String dateToString(Date d){
        String dateN = d.month + " " + d.day + ", " + d.year;
        return dateN;
    }
}
