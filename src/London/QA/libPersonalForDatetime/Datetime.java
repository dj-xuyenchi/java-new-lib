/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package London.QA.libPersonalForDatetime;

import QA.Exception.QADateTimeException;

/**
 *
 * @author nguye
 */
public class Datetime {

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    private int day;
    private int month;
    private int year;
    private int second;
    private int minute;
    private int hour;
    private final String error = "Format lỗi!";

    public Datetime() {
    }

    public Datetime(int day, int month, int year) throws QADateTimeException {
        if (!DatetimeValid.checkYear(year) || !DatetimeValid.checkMonth(month) || !DatetimeValid.checkDay(day, month, year)) {
            throw new QADateTimeException(error);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Datetime(int day, int month, int year, int second, int minute, int hour) throws QADateTimeException {
        if (!DatetimeValid.checkYear(year) || !DatetimeValid.checkMonth(month) || !DatetimeValid.checkDay(day, month, year) || !DatetimeValid.checkSecond(second) || !DatetimeValid.checkMinute(minute) || !DatetimeValid.checkHour(hour)) {
            throw new QADateTimeException(error);
        }
        this.day = day;
        this.month = month;
        this.year = year;
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }
////////////////////////////////////////// chuwa xong
    public boolean addDay(int number) {
        if (number < 1) {
            return false;
        }
        return true;
    }
}
